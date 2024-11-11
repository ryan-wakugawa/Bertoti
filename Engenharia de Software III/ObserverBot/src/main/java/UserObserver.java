import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

public class UserObserver implements Observer {
    private final long chatId;

    public UserObserver(long chatId) {
        this.chatId = chatId;
    }

    @Override
    public void send(TelegramClient telegramClient, String message) {
        SendMessage sendMessage = SendMessage.builder()
                .chatId(chatId)
                .text(message)
                .build();

        try {
            telegramClient.execute(sendMessage); // Envia a mensagem ao usuário
        } catch (TelegramApiException e) {
            e.printStackTrace();
            System.out.println("Falha ao enviar a mensagem para o usuário " + chatId);
        }
    }

    @Override
    public long getChatId() {
        return chatId;
    }
}
