public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smarTv = new SmartTv();

        System.out.println("Tv is on?: " + smarTv.isOn);
        System.out.println("your channel is: "+ smarTv.channel);
        System.out.println("your volume is: " + smarTv.volume);

        smarTv.on();
        System.out.println("Tv is on?: " + smarTv.isOn);
    }
}
