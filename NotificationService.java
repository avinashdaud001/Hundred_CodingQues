public class NotificationService {
//    protected String getMessage() {
//    return message;

    public static abstract class NotificationService {
        private String message;

        protected String getMessage() {
            return message;
        }
        public void setMessage(String message){
            this.message=message;

        }
        public abstract String sendNotification();
        public NotificationService(String message){
            this.message=message;
        }
    }

//     public void setmessage(String message) {
//         this.message = message;
//     }

//     public abstract String sendNotification() ;



//   public NotificationService(String message) {
//         this.message = message;

//     }
// }

// public class EmailService extends NotificationService {
//     String email;

//     String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     String sendNotification() {
//         return "Email sent to:" < email > "with message:" < message >


//     }
// }






    /* TODO 1: Provide an abstract class, NotificationService, with the following attributes
     * and methods.
     *
     * Attributes:
     * 		- message: String
     * 		Also provide getters and setters for it.
     *
     * Methods:
     * 		+ sendNotification(): String (make this method public and abstract)
     *
     * Constructor:
     * 		+ NotificationService (message: String)
     *
     */


}
