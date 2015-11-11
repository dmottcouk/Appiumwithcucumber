$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Appiumfeature1.feature");
formatter.feature({
  "id": "this-is-my-control-page-tests",
  "description": "",
  "name": "This is my Control Page Tests",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 9019737676,
  "status": "passed"
});
formatter.scenario({
  "id": "this-is-my-control-page-tests;as-a-user-of-the-newmetro-app-i-can-enter-the-beats-per-minute-into-the-edit-field",
  "description": "",
  "name": "As a User of the NewMetro app I can enter the beats per minute into the Edit field",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Control page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I enter \"100\" into the BPM field",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I enter the Return key",
  "keyword": "And ",
  "line": 7
});
formatter.step({
  "name": "The Slider will be set to value \"100\"",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "Steps.i_am_on_the_Control_page()"
});
formatter.result({
  "duration": 53202360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 9
    }
  ],
  "location": "Steps.i_enter_into_the_BPM_field(String)"
});
formatter.result({
  "duration": 24795185317,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_enter_the_Return_key()"
});
formatter.result({
  "duration": 137228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 33
    }
  ],
  "location": "Steps.the_Slider_will_be_set_to_value(String)"
});
formatter.result({
  "duration": 2004405032,
  "status": "passed"
});
formatter.after({
  "duration": 778728863,
  "status": "passed"
});
formatter.before({
  "duration": 8442850057,
  "status": "passed"
});
formatter.scenario({
  "id": "this-is-my-control-page-tests;as-a-user-of-the-newmetro-app-i-can-enter-the-beats-per-minute-by-using-the-slider",
  "description": "",
  "name": "As a User of the NewMetro app I can enter the beats per minute by using the slider",
  "keyword": "Scenario",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Control page",
  "keyword": "Given ",
  "line": 12
});
formatter.step({
  "name": "I set the slider bpm value to \"100\"",
  "keyword": "When ",
  "line": 13
});
formatter.step({
  "name": "The BPM field will be set to value \"100\"",
  "keyword": "Then ",
  "line": 14
});
formatter.match({
  "location": "Steps.i_am_on_the_Control_page()"
});
formatter.result({
  "duration": 41200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 31
    }
  ],
  "location": "Steps.i_set_the_slider_bpm_value_to(String)"
});
formatter.result({
  "duration": 2288057226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 36
    }
  ],
  "location": "Steps.the_BPM_field_will_be_set_to_value(String)"
});
formatter.result({
  "duration": 309423216,
  "status": "passed"
});
formatter.after({
  "duration": 816292016,
  "status": "passed"
});
});