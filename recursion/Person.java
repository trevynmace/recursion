package recursion;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private String favoriteColor;

    public Person(String firstName, String lastName, int age, String favoriteColor)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public String getFavoriteColor()
    {
        return favoriteColor;
    }

    public void setFirstName(String newFirstName)
    {
        firstName = newFirstName;
    }

    public void setLastName(String newLastName)
    {
        lastName = newLastName;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public void setFavoriteColor(String newFavoriteColor)
    {
        favoriteColor = newFavoriteColor;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName + ", Age: " + age + ", Favorite Color: " + favoriteColor;
    }
}