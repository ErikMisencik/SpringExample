package car.bean;

public class MyBean {

    public String message;


    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
      System.out.println(message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
