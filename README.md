# HappyKandy
Use Fresco like Picasso or Glide(verion0.01/2015-08-23)
I will keep update it...

#Screen
<img src="http://i.imgur.com/EihLcOE.jpg" width="45%">

#Usage
In first version you will use happykandy like this:

###common way:            
    with().load().into(),just like picasso

    HappyKandy
    		.with(context)
    				.load(bean.getImage())
    				        .into(draweeView);

###setAspectRatio:     

    HappyKandy
    		.load(bean.getImage())
    				.setAspectRatio(1.68f)
    				        .into(draweeView);     

###setGifTrue:                 

    HappyKandy
    		.load(bean.getImage())
    				.setAspectRatio(1.68f)
    				        .setGifTrue()
    				            .into(draweeView);


#Import

android studio Module build.gradle

	dependencies {
	    compile 'com.sabria:happykandy:0.01'
	}


#Libraries Used

Fresco ：  [http://frescolib.org/](http://frescolib.org/)

#License

Copyright 2015 xiaomeixw

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
