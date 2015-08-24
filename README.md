# HappyKandy
Use Fresco like Picasso or Glide(verion0.01/2015-08-23)
I will keep update it...

In first version you will use happykandy like this:

common way:            
    with().load().into(),just like picasso

    HappyKandy
    		.with(context)
    				.load(bean.getImage())
    				        .into(draweeView);

setAspectRatio:     

    HappyKandy
    		.load(bean.getImage())
    				.setAspectRatio(1.68f)
    				        .into(draweeView);     

setGifTrue:                 

    HappyKandy
    		.load(bean.getImage())
    				.setAspectRatio(1.68f)
    				        .setGifTrue()
    				            .into(draweeView);
