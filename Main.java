public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Argumentos JVM-K");
            System.out.println("By Kabono");
            System.out.println("Use JDK-21.");
            ProcessBuilder processBuilder = new ProcessBuilder(
                "java",
                "-Xms20G",
                "-Xmx20G",
                "-XX:ThreadStackSize=1M",
                "-XX:+UseG1GC",
                "-XX:MaxGCPauseMillis=20",
                "-XX:ParallelGCThreads=16",
                "-XX:ConcGCThreads=8",
                "-XX:CompileThreshold=100",
                "-XX:+UnlockExperimentalVMOptions",
                "-XX:+EnableJVMCI",
                "-XX:-UseJVMCICompiler",
                "-Dio.netty.recycler.maxCapacity.default=0",
                "-Dio.netty.recycler.linkCapacity=1024",
                "-Dio.netty.leakDetectionLevel=disabled",
                "-Dio.netty.eventLoopThreads=6",
                "-XX:ActiveProcessorCount=-1",
                "-XX:JavaPriority1_To_OSPriority=-1",
                "-XX:JavaPriority2_To_OSPriority=-1",
                "-XX:JavaPriority3_To_OSPriority=-1",
                "-XX:JavaPriority4_To_OSPriority=-1",
                "-XX:JavaPriority5_To_OSPriority=-1",
                "-XX:JavaPriority6_To_OSPriority=-1",
                "-XX:JavaPriority7_To_OSPriority=-1",
                "-XX:JavaPriority8_To_OSPriority=-1",
                "-XX:JavaPriority9_To_OSPriority=-1",
                "-XX:JavaPriority10_To_OSPriority=-1",
                "-XX:AllocatePrefetchStepSize=256",
                "-XX:AllocatePrefetchLines=64",
                "-XX:AllocatePrefetchDistance=128",
                "-XX:AllocateInstancePrefetchLines=32",
                "-XX:AllocatePrefetchStyle=3",
                "-XX:+UseTLAB",
                "-XX:TLABSize=512K",
                "-XX:MinTLABSize=128K",
                "-XX:TLABAllocationWeight=24",
                "-XX:TLABWasteIncrement=4",
                "-XX:TLABWasteTargetPercent=8",
                "-XX:TLABRefillWasteFraction=16",
                "-Dusing.aikars.flags=https://mcflags.emc.gs",
                "-Daikars.new.flags=true",
                "-XX:+UseCompressedOops",
                "-XX:+UseCompressedClassPointers",
                "-XX:CompressedClassSpaceSize=1G",
                "-XX:MetaspaceSize=2G",
                "-XX:MaxMetaspaceSize=2G",
                "-XX:ReservedCodeCacheSize=1G",
                "-XX:InitialCodeCacheSize=1G",
                "-XX:+UseCodeCacheFlushing",
                "-XX:MaxDirectMemorySize=380M",
                "-Xss256M",
                "-XX:+ParallelRefProcEnabled",
                "-XX:+UseStringDeduplication",
                "-XX:+DisableAttachMechanism",
                "-XX:+OptimizeStringConcat",
                "-XX:+PerfDisableSharedMem",
                "-Dsun.rmi.dgc.server.gcInterval=2147483646",
                "-Dlog4j2.formatMsgNoLookups=true",
                "-XX:SoftRefLRUPolicyMSPerMB=50",
                "-XX:+DisableExplicitGC",
                "-XX:+ExplicitGCInvokesConcurrent",
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
