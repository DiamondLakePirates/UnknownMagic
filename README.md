# UnknownMagic [WIP]

## Table of Contents

1. [Description](#description)

2. [User Contributions](#contributions)

  * [Ideas and Art](#ideas_and_art)
  
  * [Code](#code_contributions)
  
  * [Coding Standards](#coding_standards)
  
  * [Reporting Bugs](#reporting_bugs)
  
3. [Building The Mod](#building_the_mod)



## <a name="description"></a>Description
Welcome to the **_UnknownMagic_** Github Project! This project is a Modification for the game of Minecraft using the Minecraft Forge API. The idea of this Mod is to create an adventuring and technical style of Mod focused on this NatualTech Design of machinery and World-Gen Ruins. There are plans for the Design of the Mod and what will be within it, but we would like there to be suprising additions and features. Therefore the items and ideas will be revealed as the Mod develops and hopefully this Mod will be full of very unique and interesting ideas never before seen in a Minecraft Mod.



## <a name="contributions"></a>Contributions
If you would like to contribute to the **_UnknownMagic_** project there are two ways of doing so. One is the Artistic and Idea based side of the project, and the other of course being the code contributions. Please read the following for what to do for each style of contribution.



### <a name="ideas_and_art"></a>Ideas and Art
---
The Artistic constributions of the Mod should either be the textures and/or block models and blockstates of the Mod, or through Idea contributions of features. Please note that for the most part the final say of what is put into the Mod and what is'nt is decided upon by both **CreedTheFreak and Wasamiam**, so please don't be dissapointed if they reject your ideas or textures. The best way to contriute to the artistic side of the Project is to send an email to our Organization email account **Email:**thetruedlp@gmail.com or by simply creating an Issue with the title format of **Feature:(Enter Feature Idea Here)** and then describe the feature inside of the comment box given. In terms of adding art, the best way would be to either send us a link at our email as stated above or simply submit a pull request with said item texture.png and/or models and blockstate files. **Creed and Wasamiam** will consider the new art, if it's accepted your contribution will be added into the game and your Github Name will be added to a list of Credits unless you would like your name changed to something else.



### <a name="code_contributions"></a>Code Contributions
---
**Note: Before writing code, please check out the Section on Coding Standards of the Mod, Otherwise we will NOT accept the pull until it follows those guidelines.**

If you would like to contribute to the source code of **_UnknownMagic_** then there will be a few ways to do so. One being Bug Fixes. This is quite self explanatory so we will let it explain itself. The other way would be to work on a feature, which will need to be assigned to you in order for us to even consider the implementation of the code you write. This is for our documentation so it's easier to track the code and find out who is doing what and where. If you have a feature Idea and would also like to implement it yourself please follow the **Ideas and Art** method for contributing ideas, but at the end of your feature idea please state clearly that you would like to implement the feature. If the idea gets approved by the maintainers, then they will assign you to that feature and as long as good code is written and you follow the guidelines below, bing, bang, boom your code will be implemented and your Github name will be added to a list of Credits unless you would like your name changed to something else.



### <a name="coding_standards"></a>Coding Standards
---
Coding standards are an important part of any open or closed source projects. The coding standards outlined below are used to increase the readability of the code and to help setup a better commenting framework for Java Docs later on. An easy way to add the syntactical coding standards we are using, would be to set a new code style with the xml file provided. Note: This is for intellij, not sure what it will be for eclipse or any other IDE.

After downloading [UnknownMagicPrefs](https://drive.google.com/open?id=0B1zEH8ickvVzNzRfRGJzLVUzV1U) Do the Following.

`File -> Settings -> Editor -> Code Style -> Java -> Click Manage -> Import the File Downloaded`



### Class Fields and Naming Conventions
---

The fields of a Class are super() important and it can be hard to understand what someone is using a field for if the name of that field is non-descriptive, so first off make sure that your fields are descriptive and are'nt single letters unless your in a for loop for incrementing. For example instead of `String n = "ancient_brick"` do something like `String sAncientBrick = "ancient_brick" `

Another useful coding standard to have is the naming conventions of a Classes Fields. So please use the conventions listed below whenever you name a classes fields. Note that for inside of methods you can use really any naming conventions you want since they are local variables, but again be descriptive with your variables.

Boolean Variables should be prefixed with a lowercase b as shown below.

`private boolean bIsBool = true;`

String Values should be prefixed with a lowercase s as shown below.

`private String sIsString = "This is a String";`

Any Other Fields should be prefixed with a lowercase m to classify it as a Member variable of that class as shown below.

`private BaseBlock mAncientBrick = new BaseBlock ();`

`private int mAge = 0;`

`private char mCharacter = 'c';`



### Method Header Comments
---

Finally the last coding standard requirement that we require will be to fully document the code you write, in terms of method headers. Any and all other types of comments can be used at your discretion. An example of the method header comments are as follows

```java
/**
* A detailed description of what the mehtod is to do
* should go as the first item inside of this comment
* block.
*
* If you have parameters for the method do the following
* @param param_name [Parameter description here]
*
* If your method either throws an exeption or catches
* one then please use the following to document it.
* @exeption [Error Here]
* or
* @throws [Error Here]
*
* If you have a return type do the following
* @return [Description of return]
*/
```

An example of the most commonly used method header in our code follows.

```java
/**
* This method will register the Block and the ItemBlock of the Block
* we want to instantiate.
*
* @param block The block to register
*
* @param itemBlock The item version of the Block to register
*
* @return The BaseBlock that was created.
*/

// Here is the Method this header is apart of
private static < T extends Block> T register (T block, ItemBlock itemBlock)
{
	GameRegistry.register (block);
	GameRegistry.register (itemBlock);
  
	if (block instanceof BaseBlock)
	{
		((BaseBlock) block).registerItemModel (itemBlock);
	}

	return block;
}
```




### <a name="reporting_bugs"></a>Reporting Bugs
---
**Coming Soon**




## <a name="building_the_mod"></a>Building UnknownMagic
---
**Coming Soon**
