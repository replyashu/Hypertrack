# Hypertrack
1. Problem Given: Draw Locations, track data and movement of the user and display the same

Reasoning behind your technical choices, including architectural. Trade-offs you might have made, anything you left out, or what you might do differently if you were to spend additional time on the project.

I have used MVP- as any new view added can be easily managed by presenter, and also clear separation of view is possible in mvp. Mock locations permissions added, mocks can be added easily by single snippet of code anytime.

I am showing current location, places he visits (polyline) and current activity below map along with stop collection button. If extra time has to be spent, I would be adding Room and Livedata, so that the values are reflected immediately on map when saved in room db, also different icons for different activity. Also, different animation and also way of showing current activity will improve. In terms of accuracy, currently the values are not configurable (time to refresh activities and location), but they can be based on scenario(if phone is in charging mode, high accuracy, less interval, etc). Frequent locations can be marked and saved, and from cache redered everytime, like office, home, etc. Also, I have added a file mapview, that can be used to show any map(google, pubnub, mapbox), need to uncomment and attach. Instead of rooms, livedata - rxjava can be another option.

Trade offs - I am just showing current activity, and places the person visits, in form of polyline in map itself. Timestamp of current place and location is shown, for previous ones, room again, will add that later. Since it's single activity app, so not adding dagger.

Support- Android 3.0+

Applications made - https://play.google.com/store/apps/details?id=com.app.buyhatke https://play.google.com/store/apps/details?id=com.buyhatke.assistant
