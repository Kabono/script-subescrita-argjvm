public class jvm-k {
    public static void main(String[] args) {
        try {
            System.out.println("Argumentos JVM-K");
            System.out.println("By Kabono");
            ProcessBuilder processBuilder = new ProcessBuilder(
              // Use "", para setar um argumento
              // também "" para finalizar.
               "java",
               "-XX:MaxRAMPercentage=95.0",
               "-Xms128M",
               "-Duser.timezone=America/Sao_Paulo",
               "-jar", "start.jar", "nogui"
            );

            processBuilder.inheritIO();
            Process process = processBuilder.start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
