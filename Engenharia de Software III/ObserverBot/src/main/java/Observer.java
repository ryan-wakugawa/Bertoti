import org.telegram.telegrambots.meta.generics.TelegramClient;

public interface Observer {
    void send(TelegramClient telegramClient, String message); // Adiciona o TelegramClient como parâmetro
    long getChatId(); // Identificador do usuário
}
