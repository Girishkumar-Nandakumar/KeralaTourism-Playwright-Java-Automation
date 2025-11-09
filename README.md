🎓 Software Testing Capstone Project: Kerala Tourism Web Application  
----------------------------------------------------------------------

🎯  Objective   
To validate the  functional, performance, security, and accessibility  aspects of the Kerala Tourism Website using modern QA methodologies and automation tools.

---

✨ Project Highlights  
-------------------------
- Full-cycle QA implementation — from manual to automation.
- Multi-tool integration:  Selenium, Selenide, Playwright, JMeter, OWASP ZAP, Lighthouse .  
- Covers  Functional, Security, Performance, and Accessibility  testing.  
- Structured reports and dashboards aligned with  IEEE 829  &  ISO/IEC/IEEE 29119  standards.

---

🌟 Project Overview
-------------------------
This project demonstrates a  comprehensive end-to-end testing suite  for the *Kerala Tourism Website* hosted on GitHub Pages.  
The goal was to assess the website’s  functionality, responsiveness, security posture, and performance stability  while building a  reusable, professional-grade test automation framework  in Java.  

It represents a  full Software Testing Life Cycle (STLC)  — from  test planning, execution, automation scripting, and reporting , to  defect tracking, RCA, and final recommendations .

---

🔗  Live Site:   
[https://hashirakb.github.io/Kerala-Tourism-Website/index.html](https://hashirakb.github.io/Kerala-Tourism-Website/index.html)

---

🛠️  Tech Stack & Frameworks 
-------------------------------
| Category | Tools & Technologies | Description |
|-----------|---------------------|--------------|
|  UI Automation  | Selenium WebDriver (Java) | Core framework for web UI automation and cross-browser testing. |
|  Advanced Automation  | Playwright (Java), Selenide | Simplified test syntax, fast execution, and BDD-style flows. |
|  Performance Testing  | Apache JMeter | Simulated load, spike, soak, and stress scenarios. |
|  Security Testing  | OWASP ZAP | Detected XSS, insecure headers, and input validation gaps. |
|  Accessibility Testing  | Lighthouse, PowerMapper | WCAG 2.1 compliance and usability validation. |
|  Framework Design  | Page Object Model (POM) | Code modularity, maintainability, and scalability. |
|  Build Tool  | Maven | Dependency management and automated test execution. |
|  Test Runner  | TestNG | Test grouping, reporting, and parallel execution. |
|  Reporting & CI/CD  | TestNG HTML Reports, GitHub Actions | Automated test runs with visual reports. |

---

🔍  Testing Scope 
---------------------
✅ Manual Testing  
- Functional validation of navigation, login, signup, and form behavior.  
- UI/UX inspection and defect classification by severity.  
- Cross-browser validation (Chrome, Edge, Firefox).  

🤖 Automation Testing  
- Selenium + TestNG framework built from scratch.  
- End-to-end workflows and negative test validation.  
- Screenshot capture and logging on test failure.  

⚙️ Performance Testing  
- Conducted  Load, Stress, Spike, and Soak  tests using Apache JMeter.  
- Simulated up to  5000 virtual users ; analyzed throughput and response trends.  

🔐 Security Testing  
- Automated scanning using  OWASP ZAP .  
- Identified  XSS injection  and missing HTTP headers (CSP, X-Frame-Options).  
- Verified that no critical data exposure or session misconfigurations exist.  

♿ Accessibility Testing  
- Evaluated with  Lighthouse  and  PowerMapper .  
- Accessibility score:  88/100  — issues found with color contrast and missing alt text.  

---

📊  Reports & Dashboards 
----------------------------
📋 [ Test Plan ](https://docs.google.com/document/d/1UEY3QI7qskxgO_O_Ry-Na7VnFVHYHj_xNUlSU7SbW3E/edit?usp=sharing)  
✅ [ Test Case Sheet ](https://docs.google.com/spreadsheets/d/1gCU6TnXUrAq_UiRaJxfTvlYT4EUX6eQxNtj7weCuuVk/edit?usp=sharing)  
🐞 [ Defect Summary Table ](https://docs.google.com/spreadsheets/d/1hntA0ejt7Yn6afpqvTxt5nI4P8xV7kCzHtyFrjE-1A0/edit?usp=sharing)  



---

🚀 Getting Started
-----------------------
Prerequisites  
- Java Development Kit (JDK 17 or higher)  
- Maven installed and configured  
- ChromeDriver / GeckoDriver / EdgeDriver installed  
- IDE: IntelliJ IDEA or Eclipse  

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧠 Key Learnings
-----------------
Integration of multiple QA tools within one cohesive framework.

Strengthened understanding of STLC, defect life cycle, and test metrics.

Mastered synchronization, waits, and modular scripting in Selenium.

Gained real-world exposure to JMeter, OWASP ZAP, and Accessibility tools.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
💡 Recommendations
-------------------
Implement input sanitization (OWASP ESAPI) to prevent XSS.

Add CAPTCHA on forms to prevent spam or automation misuse.

Enable lazy loading and GZIP compression for faster performance.

Add CSP and X-Frame-Options headers to enhance security.

Improve ARIA roles and color contrast for accessibility compliance.

🙌 Acknowledgments
-------------------
Special thanks to Shri. Sheena Rajan, our mentor and guide, for her invaluable support and mentorship.
Heartfelt gratitude to the open-source QA community for providing tools, frameworks, and shared learning resources.

🏆 Project Outcome & Takeaways
-------------------------------
📌 Successfully validated functional, performance, and security aspects of a live website.
📌 Built a professional automation framework in Selenium with reusable architecture.
📌 Demonstrated cross-tool proficiency across functional, performance, and security domains.
📌 Developed reporting and metric analysis capabilities aligned with IEEE documentation standards.
📌 Strengthened readiness for real-world QA projects and CI/CD environments.

⭐ If you found this project inspiring or helpful — please give it a star on GitHub! 🌟
