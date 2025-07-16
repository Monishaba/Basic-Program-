class Author {
    String name;
    String age;
    char gender;
    public Author(String name, String age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void display() {
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("gender:" + this.gender);
    }
}
public class TextAuthor{
    public static void main(String [] args){
        Author author = new Author("Moni", "19", 'F');
        author.display();
    }

 }

