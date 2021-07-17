# bhavani-alexa
A fun Amazon Alexa skill that lets you know interesting facts about friends at my office's 'Chaya Kada' (Tea Shop). The project utilizes Alexa Skills Kit SDK for Java.

This skill need to be hosted as an AWS Lambda Function, and will handle requests from Alexa. The code:
 - Recognizes each incoming intent request that Alexa sends, invoked by requesting 'Alexa, Ask Ente Bhavani, Who is <name>?'
 - Returns a funny response about the person in question
  
## Usage
To run this skill, below steps are required:
  1. Deploy the source code in AWS Lambda.
  2. Configure the Alexa skill to use Lambda.

### Setup AWS Lambda
  1. Build the deployment package to be uploaded to Lambda. Run `mvn assembly:assembly -DdescriptorId=jar-with-dependencies package` in the project root directory. This will generate a jar file in the target directory.
  2. Log in to the AWS Management Console and navigate to AWS Lambda.
  3. Create a Lambda function, with Java 8 as the Runtime. Specify a name, and select 'Create a new role with basic Lambda permissions' option. Leave the Advanced settings as the defaults.
  4. After creation, on the 'Code' tab, select the 'Upload from zip' option, and upload the jar file created in Step 1 (one with suffix 'jar-with-dependencies').
  5. Set the Handler as `com.unnivp.main.BVRequestStreamHandler`.
  6. Copy the ARN from the top right to be used later in the Alexa Skill Setup.
  
### Alexa Skill Setup
  1. Go to the Alexa Console and click Add a New Skill.
  2. Set "Bhavani" as the skill name and "Ente Bhavaani" as the invocation name, this is what is used to activate your skill. 
  3. Select the Lambda ARN for the skill Endpoint and paste the ARN copied from above. Click Next.
  4. Drag and drop the `IntentSchema.json` in source code 'asset' directory to 'Intent > JSON Editor' view.
  5. Save and Build the model.
  6. Go back to the Skill Information (listing) tab and 'Copy the SkillId'. Update the skill id in the `BVRequestStreamHandler` class.

### Amazon App and Echo Setup
  1. Login to Alexa app using the same credentials used for Alexa console.
  2. Navigate to 'More > Skills and Games > Your Skills > Dev'. Enable the 'Bhavani' skill.
  3. Switch on Amazon Echo, and ask `alexa ask ente bhavaani who is <insert name here>`. You should be able to get a response for a valid name.

### Examples
 - USER: Alexa ask ente bhavaani who is Sujith?
 - ALEXA : Sujith E S is the secretary, proprietor and all-in-all of Netaji Vayanasala situated in Konikkara panchayath. He also works during his leisure time.
