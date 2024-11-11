import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String botToken = "6931574966:AAGJc6M9i1JPKseEJr0V-4hDDxietPwzVvI";
        try (TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication()) {
            Bot bot = new Bot(botToken);
            botsApplication.registerBot(botToken, bot);
            System.out.println("Bot iniciado com sucesso!");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Digite uma mensagem: ");
                String mensagem = scanner.nextLine();

                if (mensagem.equals("exit")) {
                    break;
                }

                bot.getNotificationService().notifyObservers(bot.getTelegramClient(), mensagem);
                System.out.println("Mensagem enviada!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
