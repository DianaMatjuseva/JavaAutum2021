//package sef.module17.activity;
//
//import junit.framework.TestCase;
//
//public class AnimalsTest extends TestCase {

//    private Animals animals;
//    private String expectedText = "Animals species is: %s and color: %s";
//
////Create set up and in set up initialize Animals
//
//    protected void setUp() throws Exception {
//        super.setUp();
//        animals = new Animals(species);
//    }
//
//    //Create test which will validate that Dog text is returned
//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }
//
//    public void testBlackDogAnimal() {
//        animals.setColor("black");
//        assertEquals(String.format(expectedText, "Dog", "black"), animals.getColorAndSpecies("black", 0));
//
//    }
//
//    public void testWhiteCatAnimal() {
//        animals.setColor("white");
//        assertEquals(String.format(expectedText, "Cat", "white"), animals.getColorAndSpecies("white", 1));
//    }
//
//    public void testGreyMouseAnimal() {
//        animals.setColor("grey");
//        assertEquals(String.format(expectedText, "Mouse", "grey"), animals.getColorAndSpecies("grey", 2));
//    }
//
//    public void testAddSpecies() {
//        animals.setSpecies("babby shark");
//        int sizeOfAnimals = animals.getSpecies().size();
//        assertEquals("babby shark", animals.getSpecies(sizeOfAnimals - 1));
//    }
//}

