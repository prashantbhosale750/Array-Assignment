
import java.util.*;

public class Planetss {
  int PlanetNo;

  Planetss() {
    System.out.println("The Complete Guide for Planets in Solar System");
  }

  void Distance(double a) {
    System.out.println("The Distance of Planet form sun is " + a + " * 10^6 Km");
  }

  void OrbitalPeriod(double z) {
    System.out.println("The orbital period of planet is " + z + " Years");
  }

  void EquatorialDia(int y) {
    System.out.println("The equatorial diameter of planet is " + y + "Km");
  }

  void Mass(double x) {
    if (PlanetNo <= 4)
      System.out.println("The Mass Of the Planet is " + x + " * 10^24" + " kg");
    else
      System.out.println("The Mass Of the Planet is " + x + " * 10^26" + " kg");
  }

  void AverageDensity(int w) {
    System.out.println("The Average Density of planet is  " + w + " kg/m^3");
  }

  public static void main(String[] args) {
    Planetss a1 = new Planetss();

    do {
      System.out.println("There are Total Eight Planets are in the solar System");
      Scanner input = new Scanner(System.in);
      System.out.println("Please Enter the planet number for which information to get");

      a1.PlanetNo = input.nextInt();
      if (a1.PlanetNo <= 4 && a1.PlanetNo != 0) {
        System.out.println("Your selected Planet is from the terrestrial planets");
        switch (a1.PlanetNo) {

          case 1: {
            System.out.println("Your selected option is Mercury");
            System.out.println("Just wait a while information is getting ready");
            System.out.println("Mercury is the Terrestrial Planet");
            a1.Distance(57.9);
            a1.OrbitalPeriod(0.241);
            a1.EquatorialDia(4880);
            a1.Mass(3.302);
            a1.AverageDensity(5430);
            break;
          }
          case 2: {
            System.out.println("Your selected option is Venus");
            System.out.println("Just wait a while information is getting ready");
            System.out.println("Venus is the Terrestrial Planet");
            a1.Distance(108.2);
            a1.OrbitalPeriod(0.723);
            a1.EquatorialDia(12104);
            a1.Mass(4.868);
            a1.AverageDensity(5243);
            break;
          }
          case 3: {
            System.out.println("Your selected option is Earth");
            System.out.println("Just wait a while information is getting ready");
            System.out.println("Earth is the Terrestrial Planet");
            a1.Distance(149.6);
            a1.OrbitalPeriod(1.000);
            a1.EquatorialDia(12756);
            a1.Mass(5.974);
            a1.AverageDensity(5515);
            break;
          }
          case 4: {
            System.out.println("Your selected option is Mars");
            System.out.println("Just wait a while information is getting ready");
            System.out.println("Mars is the Terrestrial Planet");
            a1.Distance(227.9);
            a1.OrbitalPeriod(1.524);
            a1.EquatorialDia(6794);
            a1.Mass(6.418);
            a1.AverageDensity(3934);
            break;
          }

        }
      } else if (a1.PlanetNo > 4 && a1.PlanetNo <= 9) {
        System.out.println("The Entered Planet Is from Jovian planets");
        switch (a1.PlanetNo) {
          case 5: {
            System.out.println("Your selected option is Jupitor");
            System.out.println("Just wait a while information is getting ready");
            System.out.println("Jupitor is the jovian Planet");
            a1.Distance(778.3);
            a1.OrbitalPeriod(11.86);
            a1.EquatorialDia(142984);
            a1.Mass(1.889);
            a1.AverageDensity(1326);
            break;
          }
          case 6: {
            System.out.println("Your selected option is saturn");
            System.out.println("Just wait a while information is getting ready");
            System.out.println("Saturn is the jovian Planet");
            a1.Distance(1429);
            a1.OrbitalPeriod(29.46);
            a1.EquatorialDia(120536);
            a1.Mass(5.685);
            a1.AverageDensity(687);
            break;
          }
          case 7: {
            System.out.println("Your selected option is Uranus");
            System.out.println("Just wait a while information is getting ready");
            System.out.println("Uranus is the jovian Planet");
            a1.Distance(2871);
            a1.OrbitalPeriod(84.10);
            a1.EquatorialDia(51118);
            a1.Mass(8.682);
            a1.AverageDensity(1318);
            break;
          }
          case 8: {
            System.out.println("Your selected option is Neptune");
            System.out.println("Just wait a while information is getting ready");
            System.out.println("Neptune is the jovian Planet");
            a1.Distance(4489);
            a1.OrbitalPeriod(164.86);
            a1.EquatorialDia(49528);
            a1.Mass(1.024);
            a1.AverageDensity(1638);
            break;
          }
          case 9: {
            System.out.println("Your selected option is Pluto");
            System.out.println("Sorry as per NASA 2006 repeated solar system Pluto is removed");
            break;

          }
          default: {
            System.out.println("You Have Entered a wrong Planet Number ");
            break;
          }

        }
      }
    } while (a1.PlanetNo != 0);

  }
}
