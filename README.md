# Kotlin: An Illustrated Guide

<img src="https://github.com/user-attachments/assets/ca934c4d-794b-4132-8022-2e210d3f16c0" width="250" height="309" align="left" style="margin-right: 10px;">

Source code for the book, _Kotlin: An Illustrated Guide_.

---

- Read the book online: https://typealias.com/start
- The digital edition is available [at the shop](https://shop.typealias.com) or [on Leanpub](https://leanpub.com/kotlin-illustrated)
- The print edition is almost here! Join the [waitlist](https://print.typealias.com) today.

---

Learn Kotlin programming the fun way, with oodles of illustrations and concrete explanations, in a book that steps through the concepts one at a time in order to help you build a solid mental model of the language. Whether you're new to Kotlin, or just looking to fill in some gaps of knowledge, Kotlin: An Illustrated Guide has got you covered!

## How this code is organized

### Chapters 1-2

Chapters 1 and 2 cover the basics, like variables, types, and functions. Their code is presented as Kotlin Script (.kts) files, so that you can explore their code without the need to understand the `main()` function, which is introduced at the end of Chapter 2. You can find these files inside the `/scripts` folder.

> Note - The best way to explore the code for those chapters had previously been to open them as worksheets, so that you could see the value of each line of code. With IntelliJ's new K2 mode, though, it looks like the worksheet feature is being either reworked or deprecated. However, the same functionality still exists for scratch files, so if you're looking for that experience, you could copy and paste the code from the .kts file to a scratch file.

### Chapters 3-20

Once the `main()` function is introduced at the end of Chapter 2, the source code changes to use full Kotlin (.kt) files. You can find these files within the `/src/main/kotlin` folder.

The code in the book frequently builds upon previous code listings. In order to make sure each code listing is isolated and self-contained, _each file has its own package_. As mentioned in Chapter 4, a best practice is that each package should have its own corresponding folder on the file system. However, in this project, since each file in has its own package, following that guideline would result in hundreds of extra folders, which would only add friction to finding the file you're looking for. So instead, there's only a folder for each chapter, and a file for each listing.
