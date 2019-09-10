module.exports = {
    convert: function($, f) {
    	f.wrap($, 'themecleanflex-components-block')
        f.bindAttribute($.parent(),'model','model')

        f.addStyle( $.find('div'), 'height', 'model.carouselheight', 'vh')
        f.addStyle( $.find('div'), 'maxHeight', 'model.carouselheight', 'vh')

        let carousel = $;
        f.bindAttribute(carousel, "autoplay", "model.autoplay === 'true'")
        f.bindAttribute(carousel, "navigationEnabled", "model.controls === 'true'")
        f.bindAttribute(carousel, "paginationEnabled", "model.indicators === 'true'")
        f.bindAttribute(carousel, "autoplayHoverPause", "model.pause === 'true'")
        f.bindAttribute(carousel, "centerMode", "true")
        f.bindAttribute(carousel, "loop", "model.wrap === 'true'")
        f.bindAttribute(carousel, "autoplayTimeout", "model.interval * 1000")
        f.bindAttribute(carousel, "perPage", "model.itemsperpage")

        let slide = $.find('slide').first();
        f.addFor(slide, "model.slides");

        let link = $.find('a');
        f.addIf(link, "item.slidelink")
        f.bindAttribute(link, 'href', "item.slidelink")

        let image = $.find('v-lazy-image').first()

        f.addIf(image, "item.imagepath")
        f.bindAttribute(image, "src", "item.imagepath")
        f.bindAttribute(image, "alt", "item.alt")
        f.bindAttribute(image, "class", "item.imagefit === 'cover' ? 'object-cover' : 'object-contain'", false)

        let h2 = $.find('h2').first()
        f.addIf(h2, "item.title")
        f.mapRichField(h2, "item.title")
        f.bindAttribute( h2, 'class', "{'bg-gray-700': model.captionbg === 'true', 'pb-12': model.indicators === 'true'}", false)



        let figcaption = $.find('figcaption').first()
        f.addIf(figcaption, "item.text")
        f.mapRichField(figcaption, "item.text")
        f.bindAttribute( figcaption, 'class', "{'bg-gray-700': model.captionbg === 'true', 'pb-12': model.indicators === 'true'}", false)

        f.addElse($);
        $.parent().prepend('<div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>')

    }
}
