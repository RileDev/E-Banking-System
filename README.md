# E-Banking-System
Explanation: This application was made for the final project for the subject "The Introduction to Object-oriented Programming in Java 1" in my faculty of information technologies.
<h1>English documentation</h1>

<h2>1. Theme Suggestion</h2>
E-banking application includes user authentication, checking the bank account, money transfer, and view of user transactions. Also, user can change their PIN code and view their account.
<h2>2. Description of functionalities</h2>
This application contains user registration and user login. The user through registration can create their bank account, where it is necessary to include their first name, last name, gender, PIN for login, e-mail address, and user's ID number (JMBG). The application will automatically give their bank account number, which is formatted like XXXX-XXXX-XXXX-XXXX, where X is represented as a random number between 0-9. When the user creates their bank account, they can log in to their bank account where the application automatically redirects to the main menu of the application. The menu has 5 different options, selecting numbers from 1 to 5 (0 is for exiting the app) and choosing the action the user wants to do.
<h2>3. Application structure</h2>

![Picture](https://github.com/RileDev/E-Banking-System/assets/71150306/f7718cad-497b-42cf-b568-f6fa887ccfd6)

This application was made by using multiple classes. It follows the object-oriented concept of programming. The "Main" class is the starting class of this application. Other classes are classified with Java packets that describe what they do. It has 3 main packets that are divided into classes, exceptions, and interfaces. The "classes" package is divided into these sub-packets: auth, dataManagement, ui, and user. The class in the "auth" package contains all the methods for user authentication. In the "dataManagement" package, there are classes for file management and data validation. In the "ui" package, there is a class for the UI part of the application, while in the "user" package, it contains "model" classes for data presentation. The "exceptions" package contains classes that inherit the class "Exception", and their usage is for throwing exceptions. Interfaces are placed in the package called "interfaces". Testing classes are placed outside of the "src" directory because there are classes for testing methods. This directory has the name "Test".

<h2>4. User manual</h2>
<h5>User Registration</h5>
When the user starts the application, on the console will be displayed 2 options.

![2](https://github.com/RileDev/E-Banking-System/assets/71150306/40cfdadc-d60b-46fc-9f0a-18c2ccefbd29)

The first option is to create a new account. If the user types 1 on the console, the user will be redirected to the menu for creating a new account.

![3](https://github.com/RileDev/E-Banking-System/assets/71150306/285e1181-8467-46d4-b713-7968ec15bfaa)

The application will ask questions to the user such as first name, last name, gender, e-mail address, 4-digit PIN, and user's ID number (JMBG). If the user correctly types all data, the account will be successfully opened.

<h5>User login</h5>
To access to user's account, it was necessary to type number 2 on the console. The prompt for user registration/login will be automatically displayed on the screen.

![4](https://github.com/RileDev/E-Banking-System/assets/71150306/468beef8-eec8-4bc5-8759-bc4622378782)

If the user types number 2, the application will ask them to insert a valid mail address and 4-digit PIN that the user selected during the registration process.
When the user logs in successfully, the menu will be shown and the user can select which functionality they want.
These are the functions that the user can access:
1) Check your balance
2) Transfer funds
3) Change your PIN code
4) Check your profile
5) Check your transactions
0) Exit the application

<h5>Checking the balance</h5>
If the user wants to check his account balance, type 1 on the console.

![5](https://github.com/RileDev/E-Banking-System/assets/71150306/b351955e-21f2-4054-8e43-0639e1e02532)

When the user types number 1, the balance will be shown on the screen.
When the functionality executes, the user will be automatically redirected to the main menu.

<h5>Transferring the funds to different bank accounts </h5>
If the user wants to transfer the funds to a different bank account, type 2 on the console

![6](https://github.com/RileDev/E-Banking-System/assets/71150306/2644765f-0916-4194-a484-6771a51ea865)


<h1>Srpska dokumentacija</h1>

<h2>1.	Predlog teme</h2>
E-banking aplikacija će sadržati autentifikaciju korisnika, uvid na stanje računa, slanje novca kao i pregled transakcija koju je korisnik napravio. Takođe, korisnik moze da promeni pin svog koda, i da pogleda svoj lični profil.
<h2>2.	Opis funkcionalnosti</h2>
Ova aplikacija sadrži registraciju i prijavu korisnika. Korisnik preko registracije kreira svoj lični bankovni račun, gde mu je neophodno da unese svoje ime, prezime, pol, pin za login, e-mail adresu i jmbg. Aplikacija će automatski dodeliti korisniku svoj broj računa kojeg je formata XXXX-XXXX-XXXX-XXXX, gde X predstavlja random broj od 0-9. Kada korisnik napravi svoj nalog, može da uradi login gde ga aplikacija preusmerava na glavni meni aplikacije. Meni ima 5 opcija, gde unosom od 1-5 (0 je za exit aplikacije) bira koju će funkciju da izabere.
<h2>3.	Struktura aplikacije</h2>

![Picture](https://github.com/RileDev/E-Banking-System/assets/71150306/f7718cad-497b-42cf-b568-f6fa887ccfd6)

Aplikacija je napravljena koristeći više klasa, to jest koristi koncept objektno-orijentisanog programiranja. Klasa “Main” je pokretačka klasa pomoću koje pokrećemo aplikaciju. Druge klase su klasifikovane pomoću paketa koji opisuju šta klasa treba da radi. Imamo 3 glavne podele paketa, classes, exceptions i interfaces. Paket classes je podeljena na sledeće pakete: auth, dataManagement, ui i user. Klasa u auth paketu je zaslužna za klasu koja vrši autentifikaciju korisnika. U dataManagement paketu se nalaze klase za rad sa fajlovima i validaciju podataka. U ui paketu je klasa za UI deo aplikacije, dok za paket user imamo ‚‚model” klase za predstavljanje podataka. exceptions paket sadrži klase koje nasleđuju klasu Exception, i služe za bacanje izuzetaka. Interfejsi su smešteni u paketu pod nazivom interfaces.
Klase za testiranje su smeštene izvan direktorijuma src, jer tu se nalaze klase koje služe da testiraju metode. Direktorijum sadrži ime Test.
<h2>4.	Korisničko uputstvo</h2>
<h5>Registracija korisnika</h5>
Kada korisnik pokrene aplikaciju, u konzoli će biti ispisane 2 opcije koju korisnik može da izabere. 

![2](https://github.com/RileDev/E-Banking-System/assets/71150306/40cfdadc-d60b-46fc-9f0a-18c2ccefbd29)

Prva opcija je za kreiranje korisnika. Ukoliko korisnik u konzoli napiše broj 1, korisnik tada ulazi u meni za kreiranje naloga.

![3](https://github.com/RileDev/E-Banking-System/assets/71150306/285e1181-8467-46d4-b713-7968ec15bfaa)

Aplikacija će postaviti korisniku pitanja u vidu imena, prezimena, pol, e-mail adresa, četvorocifreni pin kod i jmbg osobe. Ukoliko korisnik pravilno unese sve podatke, račun će biti uspešno otvoren.

<h5>Prijava korisnika</h5>
Da bi korisnik pristupio svom nalogu, neophodno je da unese broj 2 u konzoli. Prompt za odabir registracije/login će se automatski prikazati na ekranu.

![4](https://github.com/RileDev/E-Banking-System/assets/71150306/468beef8-eec8-4bc5-8759-bc4622378782)

Kada korisnik unese broj 2, aplikacija će pitati korisnika za unos mail adrese i četvorocifrenog pin koda koji je korisnik izabrao prilikom registracije.
Kada se korisnik uspešno prijavi, prikazaće mu se glavni meni gde može da izabere koju funkcionalnost aplikacije želi da uradi.
Funkcije koja aplikacija nudi su sledeće:
1)	Proverite stanju na računu
2)	Prebacite sredstava
3)	Promenite vaš PIN kod
4)	Pogledajte vaš profil
5)	Pogledajte vaše transakcije
6)	Izadjite iz aplikacije

<h5>Provera stanje računa</h5>
Ukoliko korisnik želi da proveri svoje stanje na računu, neophodno je da u konzoli napiše broj 1.

![5](https://github.com/RileDev/E-Banking-System/assets/71150306/b351955e-21f2-4054-8e43-0639e1e02532)

Kada korisnik izabere broj 1, ispisaće korisniku stanje na računu. 
Kada se funkcija izvrši, korisnika će automatski prebaciti na glavni meni.
<h5>Prebacivanje sredstava na drugi bankovni račun</h5>
Ukoliko korisnik želi da prebaci sredstava na drugi bankovni račun, neophodno je da u konzoli napiše broj 2.

![6](https://github.com/RileDev/E-Banking-System/assets/71150306/2644765f-0916-4194-a484-6771a51ea865)

Od korisnika se traži da unese bankovni račun recipijenta, kojeg mora biti odgovarajućeg formata (XXXX-XXXX-XXXX-XXXX). 
U drugom polju, korisnik unosi koliko novaca (u EUR) želi da prebaci na drugi bankovni račun.
U trećem polju, korisnik unosi svrhu plaćanja.
Ukoliko su svi parametri ispravni, korisniku se ispisuje poruka da je novac uspešno poslat.
<h5>Promena PIN koda</h5>
Ukoliko korisnik želi da promeni svoj četvorocifreni pin kod, neophodno je da u konzoli napiše broj 3.

![7](https://github.com/RileDev/E-Banking-System/assets/71150306/487bee74-f5c7-4789-8e22-1ab88fad1de1)

Od korisnika se traži da unese trenutni pin, nakon toga korisnik unosi novi pin i potvrdjuje ga ponovnim unosom novog pina.
<h5>Pregled profila</h5>
Ukoliko korisnik želi da pogleda svoj profil, neophodno je da u konzoli napiše broj 4.

![8](https://github.com/RileDev/E-Banking-System/assets/71150306/316661cb-7a65-4b3d-86b7-4e035d71e8eb)

Aplikacija će ispisati sve informacije o korisniku.
<h5>Pregled transakcija</h5>
Ukoliko korisnik želi da pregleda svoje transakcije, neophodno je da u konzoli napiše broj 5.

![9](https://github.com/RileDev/E-Banking-System/assets/71150306/cca33899-de94-4377-a6b9-a2b2136806d7)

Od korisnika se traži da unese datum transakcije (u formatu dd-MM-yyyy, npr. 11-06-2024). Nakon unosa datuma, aplikacija će prikazati listu svih transakcija koje su napravljene tog dana.
<h5>Izlaz iz aplikacije</h5>
Ukoliko korisnik želi da izađe iz aplikacije, neophodno je da u konzoli napiše broj 0.

![10](https://github.com/RileDev/E-Banking-System/assets/71150306/dbf119b9-9e20-453e-a0da-310deb3af85b)

Korisnik može izaći iz aplikacije ukoliko se nalazi na glavnom meniju.
<h2>5.	Zaključak</h2>
Ova aplikacija predstavlja odličan projekat u kome možemo naučiti jednostavne, ali i napredne principe objektnog-orijentisanog programiranja. U ovom projektu smo obuhvatili unos podataka sa tastature, obrada podataka, štampanje izlaza na ekranu, kao i čuvanje podataka u fajlu. Takodje, aplikacija radi autentifikaciju korisnika, kreiranje korisnika i izmenu podataka. Ovaj projekat može da bude aplikacija koja bi mogla da se koristi u komercijalnoj upotrebi (ukoliko ima GUI). Da bi ova aplikacija imala svoj potencijal, mogla bi da ima više vrsta računa (dinarski, devizni), čuvanje broj računa recipijenata, slanje mesečnog izvoda na mail-u, naprednija autentifikacija i još mnogo toga.
