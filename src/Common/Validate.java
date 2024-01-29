package Common;

public class Validate {

    public boolean validFormat(String p) {
        int length = p.length();

        switch (length) {
            case 10:  // 1234567890
                return p.matches("\\d{10}");
            case 12:  // 123-456-7890
                if (p.matches("\\d{3}-\\d{3}-\\d{4}")) return true;
                // 123.456.7890
                else if (p.matches("\\d{3}\\.\\d{3}\\.\\d{4}")) return true;
                // 123 456 7890
                else if (p.matches("\\d{3} \\d{3} \\d{4}")) return true;
                else return false;
            case 14:  // (123)-456-7890
                return p.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}");
            case 18:  // 123-456-7890 x1234
                return p.matches("\\d{3}-\\d{3}-\\d{4} x\\d{1,4}");
            case 20:  // 123-456-7890 ext1234
                return p.matches("\\d{3}-\\d{3}-\\d{4} ext\\d{1,4}");
            default:
                return false;
        }
    }

}
