# E-Banking-System
Explanation: This application was made for the final project for the subject "The Introduction to Object-oriented Programming in Java 1" in my faculty of information technologies.
<h1>English documentation</h1>

**will be written here soon**

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
