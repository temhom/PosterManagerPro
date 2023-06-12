import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    PosterManager manager = new PosterManager();


    @Test
    public void ShouldAddPoster() {

        manager.addPoster("Poster I");

        String[] expected = {"Poster I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldAddPosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");

        String[] expected = {"Poster I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldNotAddWithNoPoster() {

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldNotAddWithNoPosterLimit() {
        PosterManager manager = new PosterManager(5);

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldAddNinePoster() {

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");
        manager.addPoster("Poster VII");
        manager.addPoster("Poster VIII");
        manager.addPoster("Poster IX");

        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V", "Poster VI", "Poster VII", "Poster VIII", "Poster IX"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldAddFourPosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");


        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldAddTenPoster() {

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");
        manager.addPoster("Poster VII");
        manager.addPoster("Poster VIII");
        manager.addPoster("Poster IX");
        manager.addPoster("Poster X");

        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V", "Poster VI", "Poster VII", "Poster VIII", "Poster IX", "Poster X"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldAddFivePosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");


        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldAddElevenPoster() {

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");
        manager.addPoster("Poster VII");
        manager.addPoster("Poster VIII");
        manager.addPoster("Poster IX");
        manager.addPoster("Poster X");
        manager.addPoster("Poster XI");

        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V", "Poster VI", "Poster VII", "Poster VIII", "Poster IX", "Poster X", "Poster XI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldAddSixPosterUpLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");

        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V", "Poster VI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllOnePoster() {

        manager.addPoster("Poster I");

        String[] expected = {"Poster I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllOnePosterLimit() {

        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");

        String[] expected = {"Poster I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllWithNoPoster() {

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllWithNoPosterLimit() {
        PosterManager manager = new PosterManager(5);

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllNinePoster() {

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");
        manager.addPoster("Poster VII");
        manager.addPoster("Poster VIII");
        manager.addPoster("Poster IX");

        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V", "Poster VI", "Poster VII", "Poster VIII", "Poster IX"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllFourPosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");


        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllTenPoster() {

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");
        manager.addPoster("Poster VII");
        manager.addPoster("Poster VIII");
        manager.addPoster("Poster IX");
        manager.addPoster("Poster X");

        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V", "Poster VI", "Poster VII", "Poster VIII", "Poster IX", "Poster X"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllFivePosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");


        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllElevenPoster() {

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");
        manager.addPoster("Poster VII");
        manager.addPoster("Poster VIII");
        manager.addPoster("Poster IX");
        manager.addPoster("Poster X");
        manager.addPoster("Poster XI");

        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V", "Poster VI", "Poster VII", "Poster VIII", "Poster IX", "Poster X", "Poster XI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindAllSixPosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");

        String[] expected = {"Poster I", "Poster II", "Poster III", "Poster IV", "Poster V", "Poster VI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastWithOnePoster() {

        manager.addPoster("Poster I");

        String[] expected = {"Poster I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastWithOnePosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");

        String[] expected = {"Poster I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastWithNoPoster() {

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastWithNoPosterLimit() {
        PosterManager manager = new PosterManager(5);

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastWithNinePoster() {

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");
        manager.addPoster("Poster VII");
        manager.addPoster("Poster VIII");
        manager.addPoster("Poster IX");

        String[] expected = {"Poster IX", "Poster VIII", "Poster VII", "Poster VI", "Poster V", "Poster IV", "Poster III", "Poster II", "Poster I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastWithFourPosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");


        String[] expected = {"Poster IV", "Poster III", "Poster II", "Poster I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastWithTenPoster() {

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");
        manager.addPoster("Poster VII");
        manager.addPoster("Poster VIII");
        manager.addPoster("Poster IX");
        manager.addPoster("Poster X");

        String[] expected = {"Poster X", "Poster IX", "Poster VIII", "Poster VII", "Poster VI", "Poster V", "Poster IV", "Poster III", "Poster II", "Poster I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastWithFivePosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");


        String[] expected = {"Poster V", "Poster IV", "Poster III", "Poster II", "Poster I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void ShouldFindLastWithElevenPoster() {

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");
        manager.addPoster("Poster VII");
        manager.addPoster("Poster VIII");
        manager.addPoster("Poster IX");
        manager.addPoster("Poster X");
        manager.addPoster("Poster XI");

        String[] expected = {"Poster XI", "Poster X", "Poster IX", "Poster VIII", "Poster VII", "Poster VI", "Poster V", "Poster IV", "Poster III", "Poster II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void ShouldFindLastWithSixPosterLimit() {
        PosterManager manager = new PosterManager(5);

        manager.addPoster("Poster I");
        manager.addPoster("Poster II");
        manager.addPoster("Poster III");
        manager.addPoster("Poster IV");
        manager.addPoster("Poster V");
        manager.addPoster("Poster VI");

        String[] expected = {"Poster VI", "Poster V", "Poster IV", "Poster III", "Poster II"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}