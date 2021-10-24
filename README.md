# sdet_met
 
This project is used to show the thought process of preparing for/highlighting technical ability for a SDET role.

The stages should help focus the structure of the preparation.
As a minimum as each stage is completed a git tag should be applied to easily allow for diffs between each stage to see the progression of the thought process

<HR>
<B>Stage 1 : BRAINSTORM</B>

* Review the LinkedIn profiles for existing employees at the company to get a better understanding of the tech stack used (or ask)
* Download App
  * Look at current App reviews - Google Play Store


<HR>
<B>Stage 2 : DOCUMENT TECH STACK TO IMPLEMENT</B>

* CI Pipeline/Jenkins/Cloud/Docker?
* Set out package structure

<HR>
<B>Stage 3 : IMPLEMENT</B>

* Take into consideration re-use (maybe setup core lib)
* Maven Dependency Management BOM POM
* Include reporting (cucumber reports?)
* ....

<HR>
<B>Relevant Domain Knowledge</B>
<HR>

* Invoicing - Rounding issues for the displayed invoice lines vs actual
  * Unit of measure (on price and on quantity)
  * FX - Traded at 4 decimal places (inverse calculations should be more to round to the most correct 2DP value)
* Accounting
  * Balanced Ledgers
  * On / Off Risk
* Securitisation 
  * Selling off invoices to free up capital
  * Matching sold off invoices once paid
* Hedging
  * FX Risk


<HR>
<B>Open Questions/Concerns</B>
<HR>
* Going over the LinkedIn profiles most people are relatively new to the business
* Some being incorporated from BO, what is the risks/opportunities of working in such a new business?

<HR>
<B>App Feedback - Review</B>
<HR>

* 4.8 stars from 1063 reviews = pretty good
* Actively replying to feed back of reviews
  * Reach out via in app chat, how does this feedback to dev?

**Thoughts on specific feed back**
* **2021-10-19** : Automatically logging out when switching out of the app to get details to use on the invoice generation = annoyed user
    * Banking apps need to be secure
    * Potential solutions to this issue which I find particularly annoying also (without having knowledge the security is implemented)
    * Sandbox the invoice generation part of the app to allow swapping between apps without being logged out when in the invoice creation section.  Moving out of the invoice creation section of the app to, sending or any other banking areas of the app would then need re-authorisation to continue.
    * Add an import option into the app and allow text to be cut and paste more freely within the app to allow for the invoice creation.
* **2021-08-19** : Wants to see balances from other bank accounts
    * Open banking integration
*  **2021-08-30** : Want to upload PDF of receipts instead of taking a screenshot and upload the screenshot
    * No reason why you can't convert the PDF to a small image automatically (doing automatic downscaling needs to make sure details are still legible) 
*  **2021-09-01** : Complained that he sent invoice was deleted by the app, only discovered when incoming invoice was not matched
    * Needs to save the invoice, confirm invoice is saved successfully before attempting sending out the invoice