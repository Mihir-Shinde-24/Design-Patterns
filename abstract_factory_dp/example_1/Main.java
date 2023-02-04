package abstract_factory_dp.example_1;

import abstract_factory_dp.example_1.components.GPU;
import abstract_factory_dp.example_1.components.Monitor;
import abstract_factory_dp.example_1.factories.Company;
import abstract_factory_dp.example_1.factories.MsiManufacturer;

public class Main {

	public static void main(String[] args)
	{
		Company msiCompany = new MsiManufacturer();
		
		Monitor msiMonitor = msiCompany.getMonitor();
		msiMonitor.getSpecs();
		System.out.println();
		
		GPU msiGPU = msiCompany.getGPU();
		msiGPU.getSpecs();
		
		// Similiarly For Asus
	}
}
