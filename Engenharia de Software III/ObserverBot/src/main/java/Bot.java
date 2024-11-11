import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

public class Bot implements LongPollingSingleThreadUpdateConsumer {
    private final TelegramClient telegramClient;
    private final NotificationService notificationService;

    public Bot(String botToken) {
        telegramClient = new OkHttpTelegramClient(botToken);
        notificationService = new NotificationService();
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public TelegramClient getTelegramClient() {
        return telegramClient;
    }

    @Override
    public void consume(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String command = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            SendMessage message;
            switch (command) {
                case "/inscrever":
                    Observer observerToAdd = new UserObserver(chat_id);
                    Observer observerFromList = notificationService.getObservers()
                            .stream()
                            .filter(o -> o.getChatId() == chat_id)
                            .findFirst()
                            .orElse(null);
                    if (observerFromList == null) {
                        notificationService.addObserver(observerToAdd);
                        message = SendMessage.builder()
                                .chatId(chat_id)
                                .text("Você acabou de se inscrever!")
                                .build();
                    } else {
                        message = SendMessage.builder()
                                .chatId(chat_id)
                                .text("Você já está inscrito :)")
                                .build();
                    }

                    sendMessage(message);
                    break;

                case "/cancelar":
                    Observer observerToRemove = notificationService.getObservers()
                            .stream()
                            .filter(o -> o.getChatId() == chat_id)
                            .findFirst()
                            .orElse(null);
                    if (observerToRemove != null) {
                        notificationService.removeObserver(observerToRemove);
                        message = SendMessage.builder()
                                .chatId(chat_id)
                                .text("Você foi removido das notificações.")
                                .build();
                    } else {
                        message = SendMessage.builder()
                                .chatId(chat_id)
                                .text("Você não está inscrito.")
                                .build();
                    }
                    sendMessage(message);
                    break;

                default:
                    message = SendMessage.builder()
                            .chatId(chat_id)
                            .text("Comandos disponíveis:\n/inscrever - Inscrever-se para notificações\n/cancelar - Cancelar a inscrição")
                            .build();
                    sendMessage(message);
                    break;
            }
        }
    }

    private void sendMessage(SendMessage message) {
        try {
            telegramClient.execute(message); // Envia a mensagem ao usuário
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
