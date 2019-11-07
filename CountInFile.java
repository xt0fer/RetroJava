public class CountInFile {

    public static void main(String[] args) {
	FileCounting fc = new FileCounting();
	for (String arg : args) {
	    String r1 = fc.ScanTheFile(arg);
	    System.out.printf("%s %s\n", r1, arg);
	}
    }
}
