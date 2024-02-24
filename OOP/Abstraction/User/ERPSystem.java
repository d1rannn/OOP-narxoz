package OOP.Abstraction.User;

public class ERPSystem
{
    User[] memory = new User[1000]; ////максимум 1000 пользователей
    int sizeOfUsers = 0;
    public void addUser(User u){
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }
    public void printTeacher(){
        String temp = "";
        for (int i = 0; i < sizeOfUsers; i++) {
            if(memory[i] instanceof Teacher){
                temp = memory[i].getUserData();
                System.out.println(temp);
            }
        }
    }
    public void printStudent(){
        String temp = "";
        for (int i = 0; i < sizeOfUsers; i++) {
            if(memory[i] instanceof Student){
                temp = memory[i].getUserData();
                System.out.println(temp);
            }
        }
    }
    public void printUser(int index){
        String temp = "";
        if (memory[index] == null){
            System.out.println("No such user in this index");
        } else {
            temp = memory[index].getUserData();
            System.out.println(temp);
        }
    }
}
