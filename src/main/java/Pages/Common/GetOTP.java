package Pages.Common;

import javax.mail.*;

import javax.mail.search.FlagTerm;
import java.util.Arrays;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetOTP {

    String hostName = "smtp.gmail.com";
    String username = "trustwork.qa1@gmail.com";
    String password = "TrustWork123";
    int messageCount;
    int unreadMsgCount;
    String emailSubject;
    Message emailMessage;
    String emailContent;



    public void GetOTPCode() {

        System.out.println("Found OTP ");

        Properties sysProps = System.getProperties();
        sysProps.setProperty("mail.store.protocol", "imaps");

        try {
            Session session = Session.getInstance(sysProps, null);
            Store store = session.getStore();
            store.connect(hostName, username, password);
            Folder emailInbox = store.getFolder("INBOX");
            emailInbox.open(Folder.READ_WRITE);
            messageCount = emailInbox.getMessageCount();
            System.out.println("Total Message Count: " + messageCount);
          //  unreadMsgCount = emailInbox.getNewMessageCount();

            //-----------------------------------------------
            // Fetch unseen messages from inbox folder
            Message[] messages = emailInbox.search(
                    new FlagTerm(new Flags(Flags.Flag.SEEN), false));

            // Sort messages from recent to oldest
            Arrays.sort( messages, (m1, m2 ) -> {
                try {
                    return m2.getSentDate().compareTo( m1.getSentDate() );
                } catch ( MessagingException e ) {
                    throw new RuntimeException( e );
                }
            } );

            for ( Message message : messages ) {
                System.out.println(
                        "sendDate: " + message.getSentDate()
                                + " subject:" + message.getSubject() );


            }


            System.out.println("Latest message "+messages[0].getContent());
            System.out.println("Latest message "+messages[0].getSentDate());

            System.out.println("Latest message "+messages[0].getContent());





            //------------------------------------------------
            unreadMsgCount=emailInbox.getUnreadMessageCount();
            System.out.println("Unread Emails count:" + unreadMsgCount);
            emailMessage = emailInbox.getMessage(messageCount);
            emailSubject = emailMessage.getSubject();
            emailContent=emailMessage.getContent().toString();
            System.out.println("Email content ---"+emailContent);

            Pattern linkPattern = Pattern.compile("([0-9])\\w+"); // here you need to define regex as per you need
            Matcher pageMatcher =
                    linkPattern.matcher(emailMessage.getContent().toString());

            while (pageMatcher.find()) {
                System.out.println("Found OTP " + pageMatcher.group(1));
            }
            emailMessage.setFlag(Flags.Flag.SEEN, true);
            emailInbox.close(true);
            store.close();

        } catch (Exception mex) {
            mex.printStackTrace();
        }


    }
}
