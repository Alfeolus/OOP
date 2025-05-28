public abstract class Message {
    protected ILogin loginMechanism;  // Declare the variable here
    protected String sender;
    protected String recipient;
    protected String content;

    public Message(ILogin loginMechanism, String sender, String recipient, String content) {
        this.loginMechanism = loginMechanism;  // Assign it correctly here
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
    }

    public abstract void send(String username, String password);
}
