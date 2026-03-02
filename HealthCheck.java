public class HealthCheck {
    public static void main(String[] args) throws Exception {

        Process p = Runtime.getRuntime()
                .exec(new String[]{"bash", "-c", "systemctl is-active --quiet nginx"});

        if (p.waitFor() == 0)
            System.out.println("Nginx is running ✅");
        else
            System.out.println("Nginx is down ❌");
    

