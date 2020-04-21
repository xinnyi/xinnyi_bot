package ch.nyp.xinnyi;


public class Main {
    public static void main(String args[]) {

        // 1. setup bot
        // GET https://api.telegram.org/bot{{bot_token}}/setWebhook?url={{bot_url}}

        // 2. wait for requests
        // GET https://api.telegram.org/bot{{bot_token}}/sendMessage?chat_id={{chat_id}}&text={{text}}

        System.out.println(System.getenv());


    }
}
