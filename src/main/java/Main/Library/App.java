package Main.Library;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import library.entity.*;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("logos");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		addBook(em, "description...", 8798, "12.09.1987", "title");
		addAuthor(em, "Illia", "Shvedov");
		addCategory(em, "Fantasy");
		addUser(em, "Illia Shvedov", "0932455522", "shvedov@gmail.com", "27/09/1997", "details");
		em.getTransaction().commit();

		em.close();
		factory.close();
	}

	private static void addBook(EntityManager em, String description, int isbn, String date, String title) {
		Book book = new Book();
		book.setDescription(description);
		book.setIsbn(isbn);
		book.setDate(date);
		book.setTitle(title);
		em.persist(book);
	}

	private static void addAuthor(EntityManager em, String firstName, String lastName) {
		Author author = new Author();
		author.setFirstName(firstName);
		author.setLastName(lastName);
		em.persist(author);
	}

	private static void addCategory(EntityManager em, String title) {
		Category category = new Category();
		category.setTitle(title);
		em.persist(category);
	}

	private static void addUser(EntityManager em, String fullName, String phoneNumber, String email, String birthDate, String details) {
		User user = new User();
		user.setFullName(fullName);
		user.setPhoneNumber(phoneNumber);
		user.setEmail(email);
		user.setBirthDate(birthDate);
		user.setDetails(details);
		em.persist(user);
	}
}
