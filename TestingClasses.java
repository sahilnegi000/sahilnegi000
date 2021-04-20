package testTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Game.Option;
import Game.UI;
import ShipTypes.Ship;
import ShipTypes.ShipUpgrade;
import Topological.Island;
import Topological.MapOfIslands;
import Trading.Trader;

class TestingClasses {

	@Test
	void test() {
		
		// OPTION
		////////////////////////////////////////////////////////////////
		
		//
		Option option1 = new Option(6, "Cloth");
		assertEquals(6, option1.getIndex());
		assertEquals("Cloth", option1.getOptionName());
		
		//
		Option option = new Option();
		option.setOptionNumber(3);
		option.setOptionName("Van");
		
		assertEquals(3, option.getIndex());
		assertEquals("Van", option.getOptionName());
		
		assertEquals("3 : Van", option.toString());	
		
		
		
		// TRADER
		/////////////////////////////////////////////////////////////////////////
		
		//
		MapOfIslands questMap = new MapOfIslands();
		Island homeIsland = questMap.islandAtIndex(questMap.SHARK_POND_ISLAND);
		
		Trader trader1 = new Trader("Sah", 13, 2, homeIsland);
		
		assertEquals("Sah", trader1.getName());
		assertEquals(13, trader1.getNumberOfCrew());
		assertEquals(2, trader1.getNumberOfDays());
		assertEquals("Shark pond Island", trader1.getHomeIsland().getName());
		
		//
		Trader trader = new Trader();
		trader.setName("Van");
		trader.setNumCrew(2);
		trader.setNumDays(3);
		trader.setHomeIsland(questMap.islandAtIndex(questMap.DARK_SEAS_ISLAND));
		
		assertEquals("Van", trader.getName());
		assertEquals(2, trader.getNumberOfCrew());
		assertEquals(3, trader.getNumberOfDays());
		assertEquals("Dark Seas Island", trader.getHomeIsland().getName());
		
		//
		assertEquals(20, trader.getPerDayCrewWages());
		assertEquals(40, trader.getCrewWages(2));
		
		assertEquals(999980, trader.payCrew(1));
		
		//Balance before and after each item sold or bought
		assertEquals(999980, trader.getBalance());
		
		trader.makeMoney(3.5);
		assertEquals(999983.5, trader.getBalance());
		
		trader.spendMoney(2.1);
		assertEquals(999981.4, trader.getBalance());
		
		
		// SHIP UPGRADE
		//////////////////////////////////////////////////////////////////////////////////
		
		//
		Ship ship1 = new Ship("Caravel", "small highly maneuverable sailing ship", 20, 500, 12, 20000);
		ShipUpgrade shipUpgrade1 = new ShipUpgrade(ship1);
		
		assertEquals("Caravel", shipUpgrade1.getaShip().getName());
		assertEquals("small highly maneuverable sailing ship", shipUpgrade1.getaShip().getShipType());
		assertEquals(20, shipUpgrade1.getaShip().getSailSpeed());
		assertEquals(500, shipUpgrade1.getaShip().getCargoCapacity());
		assertEquals(12, shipUpgrade1.getaShip().getCrewCapacity());
		assertEquals(20000, shipUpgrade1.getaShip().getCost());
		
		/*
		//
		ShipUpgrade shipUpgrade = new ShipUpgrade(ship1);
		shipUpgrade.upgradeShip(new Ship("Big Galleon", "A large tough Pirate ship equipt with cannons", 19, 5000, 32, 1000000));
		
		assertEquals(200, shipUpgrade.getaShip().currentHealth());   
		*/
		
		
		// UI
		///////////////////////////////////////////////////////////////////////////////////
		
		//                         (//ui1.addOption(new Option(7, "Testing Option"));)

		
		
		
		
		
		
		
	}

}
