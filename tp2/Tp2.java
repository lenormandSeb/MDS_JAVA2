package com.tactfactory.javaniveau2.tps.tp2;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.xml.stream.events.Characters;

import com.tactfactory.javaniveau2.tps.tp2.entities.Car;
import com.tactfactory.javaniveau2.tps.tp2.entities.User;
import com.tactfactory.javaniveau2.tps.tp2.utils.ItemsGenerator;

/**
 *
 * @author tactfactory
 *
 *  - Créer un programme qui permet, en utilisant la fonction "stream()" sur la variable users,
 *      d'afficher les informations suivantes :
 *    - 1 : Le nombre d'utilisateur
 *    - 2 : Le nombre d'utilisateur dans la première lettre du prénom commence par "a"
 *    - 3 : Le nombre d'utilisateur dont le nom et le prénom contienent exactement 5 caractères
 *    - 4 : Le nombre d'utilisateur dont le full name contient entre 13 et 16 caractères
 *    - 5 : Les utilisateurs possédant une voiture de la marque "marque1"
 *    - 6 : La première voiture avec le plus haut kilométrage
 *    - 7 : La liste des voitures avec le plus haut kilométrage
 *    - 8 : La marque possédant le plus de voiture avec le nombre de voiture possédé
 *    - 9 : Les marques possédant le moins de voiture avec chacune des voitures pour chaque marque
 *    -10 : La liste des utilisateurs triée par nom puis par prénom
 */
public class Tp2 {

	public static void main(String[] args) {
		List<User> users = ItemsGenerator.generateUsers();

		for (User user : users) {
			System.out.println(user);
		}

//     1 : Le nombre d'utilisateur
		long nbUsers = users.stream().count();
		System.out.println(String.format("%s %d", "Nombre d'utilisateur", nbUsers));

		// 2 : Le nombre d'utilisateur dans la premiÃšre lettre du prÃ©nom commence par
		// "a"
		long nbUsersA = users.stream().filter(x -> x.getFirstname().charAt(0) == 'a').count();
		System.out.println(String.format("%s %d",
				"Nombres d'utilisateur dans la premiÃšre lettre du prÃ©nom commence par \"a\"", nbUsersA));

		// 3 : Le nombre d'utilisateur dont le nom et le prÃ©nom contienent exactement 5
		// caractÃšres
		long nbUsersFLName5 = users.stream()
				.filter(x -> x.getLastname().length() == 5 && x.getFirstname().length() == 5).count();
		System.out.println(String.format("%s %d",
				"Les utilisateurs dont le nom et le prÃ©nom contienent exactement 5 caractÃšres", nbUsersFLName5));

		// 4 : Le nombre d'utilisateur dont le full name contient entre 13 et 16
		// caractÃšres
		long nbUsersFullname1316 = users.stream()
				.filter(x -> x.getFullName().length() >= 13 && x.getFullName().length() <= 16).count();
		System.out.println(String.format("%s %d",
				"Les utilisateurs dont le full name contient entre 13 et 16 caractÃšres", nbUsersFullname1316));

		// 5 : Les utilisateurs possÃ©dant une voiture de la marque "marque1"
		List<User> usersCarMarque1 = users.stream().filter(x -> x.getCar().getCarType().getMark().equals("marque1"))
				.collect(Collectors.toList());

		System.out.println("Les utilisateurs possèdant une voiture de la marque \"marque1\"");
		for (User user : usersCarMarque1) {
			System.out.println(String.format("\t%s", user));
		}

		// 6 : La premiÃšre voiture avec le plus haut kilomÃ©trage
		System.out.println("ok");

		Car carMaxMileage = users.stream()
				.collect(Collectors.maxBy(Comparator.comparingLong(x -> x.getCar().getMileage()))).get().getCar();
		System.out.println(String.format("%s %s", "La voiture avec le plus haut kilomÃ©trage", carMaxMileage));

		// 7 : La liste des voitures avec le plus haut kilomÃ©trage
		List<Car> carMaxMileages = users.stream().filter(x -> x.getCar().getMileage() > 300000)
				.sorted(Comparator.comparingLong(x -> x.getCar().getMileage())).map(User::getCar)
				.collect(Collectors.toList());
		System.out.println("La liste des voitures avec le plus haut kilomÃ©trage");
		for (Car car : carMaxMileages) {
			System.out.println(String.format("\t%s", car));
		}

		// 8 : La marque possÃ©dant le plus de voiture avec le nombre de voiture
		// possÃ©dÃ©
//    Entry<String, List<User>> markMaxCar = users.stream();
//    System.out.println(String.format("%s est %s avec %d voitures", "La marque possÃ©dant le plus de voiture",
//        markMaxCar.getKey(), markMaxCar.getValue().size()));

		// 9 : Les marques possÃ©dant le moins de voiture avec chacune des voitures pour
		// chaque marque
//    int minCars = users.stream();
//    List<Entry<String, List<Car>>> markMinCars = users.stream();
//    System.out.println("Les marques possÃ©dant le moins de voiture avec chacune des voitures pour chaque marque");
//    for (Entry<String, List<Car>> entry : markMinCars) {
//      System.out.println("\t" + entry.getKey() + " :");
//      for (Car car : entry.getValue()) {
//        System.out.println("\t\t" + car);
//      }
//    }

		// 10 : La liste des utilisateurs triÃ©e par nom puis par prÃ©nom
//    List<User> sortedUsers = users.stream();
//    System.out.println("La liste des utilisateurs triÃ©e par nom puis par prÃ©nom");
//    for (User user : sortedUsers) {
//      System.out.println("\t" + user);
//    }
	}

}