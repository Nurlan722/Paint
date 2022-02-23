function _(selector) {
    return document.querySelector(selector);
}
function setup() {
    let canvas = createCanvas(650, 600);
    canvas.parent("canvas-wrapper");
    background(255);
}