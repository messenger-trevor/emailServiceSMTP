# Basic Spring-Starter-Mail Service

Email service for personal website backend, utilizes spring.mail and connects to an SMTP server to allow apps to send emails.

**PLEASE NOTE**

- Requires SMTP server configuration

    - I recommend gmail for non-enterprise applications, there is a draft one provided in resources, but the app still needs the username and password as well as a key.properties file.


- Method SendMessage() within EmailService requires specific message.setFrom() and message.setTo() fields. Include your specific data.

- Rest endpoint Exposed on 8080/api/email

**BACKLOG**

- [x] Properties reader for abstracting credentials
- [ ] Auth and Security
- [ ] Docker Support
