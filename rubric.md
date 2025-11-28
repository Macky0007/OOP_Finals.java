# Project Assessment Rubric

**Project:** Pet Adoption Management System
**Section:** C2A
**Course:** Object Oriented Programming

## Grading Breakdown

### 1. Class Diagram Completeness (25%)
**Score:** 5/5
**Notes:** Complete UML diagram provided via Figma, now available as uml.png. The diagram shows comprehensive class structure with proper UML notation including all 8 classes (Animal parent with Dog, Cat, Hamster, Rabbit children; Adopter; Manager with specialized manager classes). All classes display attributes with proper types and access modifiers, methods with return types, and clear inheritance relationships marked with proper UML arrows. Excellent visualization of the complete system architecture.

### 2. Java Program - OOP Concepts (50%)
**Score:** 3/5
**Notes:** Moderate implementation of OOP concepts:
- **Encapsulation**: Partially implemented - Animal class has private animalID field with some public fields (name, age), which breaks encapsulation. Adopter class has mostly public fields with only adopterAddress as private.
- **Inheritance**: Well implemented with Animal as parent class and Dog, Cat, Hamster, Rabbit as child classes extending Animal
- **Polymorphism**: Not clearly demonstrated - subclasses don't override methods or provide specialized behavior; they only call super constructor
- **Abstraction**: Minimal abstraction - Animal class is concrete, not abstract, and doesn't define abstract behaviors

The inheritance structure exists but subclasses add no specialized functionality. Encapsulation is weak with many public fields.

### 3. Git Usage & Collaboration (15%)
**Score:** 5/5
**Notes:** Excellent collaboration with significant activity from multiple contributors (Macky0007: 20 commits, darl-12: 20 commits, Macky-07: 6 commits, Michael Ong: 1 commit). Strong evidence of teamwork with balanced contributions between the two main developers. README mentions they created a new repository, showing active project management.

### 4. Base Grade (10%)
**Score:** 5/5

### 5. Extra Points (up to 6)

**Features:** 3/5
- File saving
- Console experience

**Code Quality:** 1.0/1.0
- Variable naming: 0.5/0.5
- Code organization: 0.5/0.5

**Extra Points Total:** +4.0

---

## Final Grade: 80 + 4.0 = **84/100**

*Assessment generated based on project analysis.*
