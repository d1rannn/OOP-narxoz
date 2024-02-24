package OOP.Interface.User;

class UserBeanImp implements UserBean
{
    User[] users;

    public UserBeanImp(User[] users){
        this.users = users;
    }

    @Override
    public void getAllUsers(){
        String temp = "";
        for (int i = 0; i < users.length; i++) {
            temp = users[i].getUserData();
            System.out.println(temp);
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserData().contains(name)){
                System.out.println(users[i].getUserData());
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname){
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserData().contains(surname)){
                System.out.println(users[i].getUserData());
            }
        }
    }
}
