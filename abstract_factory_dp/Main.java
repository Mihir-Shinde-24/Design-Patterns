package abstract_factory_dp;

import abstract_factory_dp.components.GPU;
import abstract_factory_dp.components.Monitor;
import abstract_factory_dp.factories.Company;
import abstract_factory_dp.factories.MsiManufacturer;

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
