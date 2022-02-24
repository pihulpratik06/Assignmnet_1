//Question::4
package JDK9;
 class JDK9Update_4 {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("Major Version " + version.major());
        System.out.println("Minor Version " + version.minor());
        System.out.println("Build " + version.build());
        

    }
}

/**
 * Major Version 11
 *  Minor Version 0
 *  Build Optional[11]
 */