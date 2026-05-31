import org.hibernate.Session;

public class HibernateDemo {

    public static void main(String[] args) {

        Session session = Hibernate.getSession();

        try {
            UserClassHibernate user = new UserClassHibernate("pant");
            session.beginTransaction();
            session.persist(user);
            session.getTransaction().commit();
            System.out.println("User saved: "+ user.getId()+ " NAME: "+ user.getName());
        }catch (Exception e){
            System.out.println(e);
        }finally {
            Hibernate.close();
        }
    }

}
