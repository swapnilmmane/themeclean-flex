module.exports = {
    convert: function($, f) {
        //f.bindPath($)
        f.wrap($, 'themecleanflex-components-block')
        f.bindAttribute($.parent(),'model','model')

        //h2
        f.mapField($.find('h2'), 'model.firstimagetitle')
        //p
        f.mapField($.find('p'), 'model.firstimagetext')
        //img
        f.bindAttribute($.find('img').first(), 'src', 'model.firstimage')
    }
}