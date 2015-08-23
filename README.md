# HappyKandy
Use Fresco like Picasso or Glide

ver0.01                            2015-08-23
in first version you will use happykandy like this:

common way:            with().load().into(),just like picasso

    FrescoManager
    				.with(context)
    				.load(bean.getImage())
    				.into(draweeView);

with setAspectRatio:     setAspectRatio(float)

    FrescoManager
    				.load(bean.getImage())
    				.setAspectRatio(1.68f)
    				.into(draweeView);     

with gif:                 setGifTrue

    FrescoManager
    				.load(bean.getImage())
    				.setAspectRatio(1.68f)
    				.setGifTrue()
    				.into(draweeView);
