package OOP.Interface.User;

public class Main
{
    public static void main(String[] args) {
        User user1 = new User("Zhansaya", "Kulbaeva");
        User user2 = new User("Gennady", "Golovkin");
        User user3 = new User("Olivia", "Oliver");
        User user4 = new User("Bethany", "Oliver");
        User user5 = new User("Emily", "Oliver");
        User user6 = new User("Poppy", "Jack");
        User user7 = new User("Elizabeth", "Olivia");
        User user8 = new User("Elizabeth", "Oliver");
        User user9 = new User("Elizabeth", "Kadirov");
        User user10 = new User("Nurbek", "Nurbekov");

        User[] users = {user1,user2,user3,user4,user5,user6,user7,user8,user9,user10};

        UserBeanImp userBeanImp = new UserBeanImp(users);

        System.out.println("All users:");
        userBeanImp.getAllUsers();
        System.out.println("Users by name:");
        userBeanImp.getUsersByName("Elizabeth");
        System.out.println("Users by surname:");
        userBeanImp.getUsersBySurname("Oliver");

        int i = users.length;
        System.out.println(i);
    }
}
