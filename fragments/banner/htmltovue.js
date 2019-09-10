module.exports = {
    convert: function($, f) {
       f.wrap($, 'themecleanflex-components-block')
       f.bindAttribute($.parent(),'model','model')
       f.bindAttribute($.find('img').first(), "src", "model.image")
       f.mapRichField($.find('h2').first(), "model.title")
       f.mapRichField($.find('p').first(), "model.text")
    }
}