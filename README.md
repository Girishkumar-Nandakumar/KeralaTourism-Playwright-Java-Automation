🎓 Kerala Tourism Web Application – Playwright Java Automation
🎯 Objective

To validate the functional, UI, performance, and cross-browser behavior of the Kerala Tourism Website using Playwright with Java.
This capstone project showcases end-to-end automation testing aligned with IEEE 829 and ISO/IEC/IEEE 29119 standards.

🌐 Live Website

🔗 Kerala Tourism Website

✨ Project Overview

This project demonstrates a comprehensive QA implementation for a static tourism website promoting Kerala’s culture and districts.
It includes both manual and automated testing, focusing on functional accuracy, form validation, and UI responsiveness.

The automation framework is built with Playwright Java, following the Page Object Model (POM) design for maintainability and scalability.

🧠 Key Features

✅ Functional, regression, and cross-browser testing

⚙️ Playwright-based modern automation with Java

🔁 Parallel test execution using TestNG

📷 Auto-screenshot capture on test failures

📈 CI/CD-ready with GitHub Actions

🔍 Trace Viewer for debugging

📱 Responsive layout testing (Desktop, Tablet, Mobile)

🛠️ Tech Stack
Category	Tools & Technologies
Automation Framework	Playwright for Java
Programming Language	Java (JDK 17+)
Test Runner	TestNG
Build Tool	Maven
Reports	Allure / TestNG HTML
Version Control	Git & GitHub
CI/CD Integration	GitHub Actions (Demo)
🧩 Test Coverage
Area	Description
🧭 Functional	Navigation, Login, Signup, Explore pages
🧩 UI/UX	Layout, responsiveness, image loading
🔐 Security	Input sanitization & form validation
🌍 Cross-Browser	Chromium, Firefox, WebKit
⚙️ Performance	Page load validation & trace review
⚙️ Setup & Execution
1️⃣ Prerequisites

Install JDK 17+

Install Maven

Install Playwright CLI:

mvn exec:java -e -Dexec.mainClass="com.microsoft.playwright.CLI" -Dexec.args="install"

2️⃣ Clone Repository
git clone https://github.com/yourusername/KeralaTourism-Playwright-Java-Automation.git
cd KeralaTourism-Playwright-Java-Automation

3️⃣ Run Tests
mvn clean test


Run with a specific browser:

mvn test -Dbrowser=firefox


To view trace:

playwright show-trace trace.zip

📊 Reports & Dashboards
Type	Link
📋 Test Plan	View Document

✅ Test Cases	View Spreadsheet

🐞 Defect Report	View Defect Sheet

📊 Performance & Security Reports

Load/Stress testing using JMeter

OWASP ZAP scan for XSS & form vulnerabilities

Accessibility Audit via Lighthouse

🔒 Security & Accessibility Findings

❗ XSS prevention recommended in signup form

🧩 Missing headers: CSP, X-Frame-Options

🔑 No CAPTCHA in form validation

♿ Alt text and ARIA roles missing for some elements

🟢 No high-severity vulnerabilities detected; medium and low issues documented.

💡 Key Learnings

Built multi-browser automation using Playwright

Improved debugging with Trace Viewer

Learned differences between Selenium, Selenide, and Playwright

Designed modular, maintainable POM structure

Integrated testing documentation as per IEEE 829

🙌 Acknowledgments

Special thanks to Ms. Sheena Rajan
for her invaluable mentorship, guidance, and support throughout this capstone journey.
Gratitude to the open-source testing community for the tools and knowledge shared.

🏆 Outcome

📌 Delivered full-cycle automation suite using modern QA stack
📌 Strengthened real-world QA documentation and reporting skills
📌 Demonstrated industry-level understanding of testing tools and processes

⭐ If you found this project helpful — please give it a star on GitHub!
It motivates us to keep building and sharing better projects 🌿
