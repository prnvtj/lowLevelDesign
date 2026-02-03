Prototype Pattern

The Prototype Pattern is a creational design pattern used to clone existing objects instead of constructing them from scratch. It enables efficient object creation, especially when the initialization process is complex or costly.

Formal Definition:
Prototype pattern creates duplicate objects while keeping performance in mind. It provides a mechanism to copy the original object to a new one without making the code dependent on their classes.

In simpler terms:
Imagine you already have a perfectly set-up object - like a well-written email template or a configured game character. Instead of building a new one every time(which can be repetitive and expensive), you just copy the existing one and make small adjustments. This is what the Prototype Pattern does. It allows you to create new objects by copying existing ones, saving time and resources.

Real-life analogy(Photocopy Machine)
Think of preparing ten offer letters. Instead of typing the same letter ten times, you write it once, photocopy it, and change just the name on each copy. This is how the Prototype Pattern works start with a base object and produce modified copies with minimal changes.

Understanding
Let's understand better through a common challenge in software systems. 

Consider an email notification system where each email instance requires extensive setup loading templates, configurations, user settings and formatting. Creating every email from scratch introduces redundancy and inefficiency

Now imaging having a pre-configures prototype email, and simple cloning it for each user while modifying a few fields(like the name of content). That would save time, reduce errors, and simplify the logic.

Suitable Use Cases
Apply the Prototype Pattern in these situations:
* Object creation is resource-intensive or complex.
* You require many similar objects with slight variations
* You want to avoid writing repetitive initialization logic
* You need runtime object creation without tight class coupling.

Issues with the code in "WithoutPrototype.java"
* Thight coupling to Concrete Class:
    * The code uses the WelcomeEmail class directly.
    * No abstraction for cloning - client code is tightly bound to object creation logic (new WelcomeEmail() everywhere)
* Repetitive Instantiation:
  * For every variation, a new instance is created using the constructor-even though most data remains the same.
  * This leads to unnecessary duplication of code and logic.
* Violates DRY Principle: Repeated calls to new WelcomeEmail() and then setContent() fopr slight modifications break the Don't Repeat Yourself principle
* No cloning or Copy Mechanism: There is a concept of cloning or reusing a pre-defined template and just modifying small parts.


Benefits of Good Design:
* Implements clone(): Allows obect copying instead of recreation.
* Introduces Registry: Central location (EmailTemplateRegistry) holds template prototypes.
* Decouples creation from usage: Client code doesn't depend on how WelcomeEmail is constructed.
* Improves performance: Avoids complex re-initialization logic by cloning pre-configured templates.

