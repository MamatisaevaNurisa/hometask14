public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Programmer", "IT", "Peaksoft");
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer);
        System.out.println("Company Name :" + programmer.getCompanyName());
        System.out.println();

        Dancer dancer = new Dancer("Dancer ", "Dancer Club", "Beautiful");
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(dancer);
        System.out.println("Group Name :" +dancer.getGroupName());
        System.out.println();

        Singer singer = new Singer("Singer", "Music Group", " Coldplay  ");
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGuitar();
        System.out.println(singer);
        System.out.println("Band Name: " + singer.getBandName());


    }
}