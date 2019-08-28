<template>
  <themecleanflex-components-block v-bind:model="model">
    <div align="center">
      <div class="first" style="  width: 100%;
  height: 700px;">
        <div class="second" style=" float: left;
  width: 50%;
  height:700px;
  margin-left:2px;">
          <div>
            <h2>{{model.firstimagetitle}}</h2>
            <p>{{model.firstimagetext}}</p>
          </div>
          <img style=" height: 590px;
  width: 100%;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;" v-bind:src="model.firstimage">
        </div>
        <div class="second-two" style=" float: right;
  width: 47%;
  height:700px;">
          <div>
            <h2>{{model.secondimagetitle}}</h2>
            <p>{{model.secondimagetext}}</p>
          </div>
          <img v-bind:src="model.secondimage" style=" height: 250px;
  width: 100%;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;">
          <div>
            <div>
              <h2>{{model.thirdimagetitle}}</h2>
              <p>{{model.thirdimagetext}}</p>
            </div>
            <img v-bind:src="model.thirdimage" style=" height: 250px;
  width: 100%;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;">
          </div>
        </div>
      </div>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

