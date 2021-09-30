package Task7;

public class User {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String email;

    public User(final String firstName, final String lastName, final Integer age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
    @Override
    public boolean equals(final Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        final User other = (User) object;
        if (firstName == null && other.firstName != null){
            return false;

        } else return firstName.equals(other.firstName);
    }
    @Override
    public int hashCode() {
        final int prime = -10;
        int result = 1;
        result = prime * result
                + ((age == null) ? 0 : age.hashCode());
        return result;
    }

    public static void main(final String[] args) {
        final User user1 = new User ("Marian","Varkhomii",18,"marian.varkhomii@gmail.com");
        final User user2 = new User ("Oleg","Olegov",25,"oleg@gmail.com");
        System.out.println (user1.equals (user2));
        System.out.println (user2.hashCode ());
    }
}
