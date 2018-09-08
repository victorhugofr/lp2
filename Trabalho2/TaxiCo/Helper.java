import java.util.Scanner;
/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author Victor Hugo Freire Ramalho
 * @version 2018.09.11
 */
public class Helper 
{
	private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	protected void setUp()
	{
		taxiCo1 = new TaxiCo("IMD's cars");
		taxiCo1.addTaxi();
		taxiCo1.addTaxi();
		taxiCo1.addShuttle();
		taxiCo1.addShuttle();
		taxiCo1.addShuttle();
	}

    /**
     * Test whether we can book a taxi.
     */
	public void testBook()
	{
		setUp();
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");		
		taxi1.book("HIPER");
		if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
		taxiCo1.showStatus();
	}

	/**
	 * Test the status of a taxi after it has arrived.
	 */
	public void testArrived()
	{
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
		taxi1.book("HIPER");
		taxi1.arrived();
		if ( taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
		taxiCo1.showStatus();
		
	}
	/**
	 * Test which is the most compatible vehicle.
	 */
	public void wantVehicle(String destination)
	{
		System.out.println("VEICULO ENCONTRADO "+ taxiCo1.wantaVehicle(destination));
		
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String dest;
		Helper helper = new Helper();
		System.out.println("Primeiro teste");
		helper.testBook();
		
		System.out.println("Segundo teste");
		helper.testArrived();

		helper.wantVehicle("Sainsbury's");
		
		
	}
}


