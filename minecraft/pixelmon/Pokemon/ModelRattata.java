// Date: 4/28/2012 8:13:44 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package pixelmon.Pokemon;

import net.minecraft.src.*;

public class ModelRattata extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer frontleftleg;
    ModelRenderer backleftleg;
    ModelRenderer backrightleg;
    ModelRenderer frontrightleg;
    ModelRenderer tail;
    ModelRenderer HeadBase;
    ModelRenderer mouthBase;
    ModelRenderer head;
    ModelRenderer teeth;
    ModelRenderer leftear;
    ModelRenderer rightear;
    ModelRenderer muzzleupper;
    ModelRenderer muzzlelower;
    
  public ModelRattata()
  {
    textureWidth = 64;
    textureHeight = 32;
    setTextureOffset("HeadBase.Face", 0, 0);
    setTextureOffset("mouthBase.Mouth", 0, 0);
    
      body = new ModelRenderer(this, 1, 1);
      body.addBox(-3F, -2F, 0F, 6, 4, 7);
      body.setRotationPoint(0F, 18.5F, -2F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      frontleftleg = new ModelRenderer(this, 34, 12);
      frontleftleg.addBox(-1F, -1F, -1F, 2, 4, 2);
      frontleftleg.setRotationPoint(2.1F, 21F, -0.9F);
      frontleftleg.setTextureSize(64, 32);
      frontleftleg.mirror = true;
      setRotation(frontleftleg, 0F, 0F, 0F);
      backleftleg = new ModelRenderer(this, 34, 12);
      backleftleg.addBox(-1F, -1F, -1F, 2, 4, 2);
      backleftleg.setRotationPoint(2.1F, 21F, 4F);
      backleftleg.setTextureSize(64, 32);
      backleftleg.mirror = true;
      setRotation(backleftleg, 0F, 0F, 0F);
      backrightleg = new ModelRenderer(this, 34, 12);
      backrightleg.addBox(-1F, -1F, -1F, 2, 4, 2);
      backrightleg.setRotationPoint(-2.1F, 21F, 4F);
      backrightleg.setTextureSize(64, 32);
      backrightleg.mirror = true;
      setRotation(backrightleg, 0F, 0F, 0F);
      frontrightleg = new ModelRenderer(this, 34, 12);
      frontrightleg.addBox(-1F, -1F, -1F, 2, 4, 2);
      frontrightleg.setRotationPoint(-2.1F, 21F, -0.9F);
      frontrightleg.setTextureSize(64, 32);
      frontrightleg.mirror = true;
      setRotation(frontrightleg, 0F, 0F, 0F);
      tail = new ModelRenderer(this, 0, 12);
      tail.addBox(0F, -10F, -4F, 0, 10, 8);
      tail.setRotationPoint(0F, 17.5F, 5F);
      tail.setTextureSize(64, 32);
      tail.mirror = true;
      setRotation(tail, 0.117629F, 0F, 0F);
    HeadBase = new ModelRenderer(this, "HeadBase");
    HeadBase.setRotationPoint(0F, 17.5F, -2F);
    setRotation(HeadBase, 0F, 0F, 0F);
    HeadBase.mirror = true;
      ModelRenderer teeth = new ModelRenderer(this, 1, 1);
      teeth = new ModelRenderer(this, 1, 1);
      teeth.addBox(-1F, 0.6666667F, -4.8F, 2, 1, 0);
      teeth.setRotationPoint(0F, 0F, 0F);
      teeth.setTextureSize(64, 32);
      teeth.mirror = true;
      setRotation(teeth, 0.0872665F, 0F, 0F);
      HeadBase.addChild(teeth);
      ModelRenderer leftear = new ModelRenderer(this, 28, 0);
      leftear.mirror = true;
      leftear = new ModelRenderer(this, 28, 0);
      leftear.addBox(-3.5F, -6F, 0.8F, 4, 4, 0);
      leftear.setRotationPoint(0F, 0F, 0F);
      leftear.setTextureSize(64, 32);
      leftear.mirror = true;
      setRotation(leftear, 0.0174533F, -0.0872665F, -0.296706F);
      HeadBase.addChild(leftear);
      ModelRenderer rightear = new ModelRenderer(this, 28, 0);
      rightear = new ModelRenderer(this, 28, 0);
      rightear.addBox(-0.5F, -6F, 0F, 4, 4, 0);
      rightear.setRotationPoint(0F, 0F, 0F);
      rightear.setTextureSize(64, 32);
      rightear.mirror = true;
      setRotation(rightear, 0.0872665F, 0F, 0.296706F);
      HeadBase.addChild(rightear);
      ModelRenderer muzzleupper = new ModelRenderer(this, 18, 20);
      muzzleupper = new ModelRenderer(this, 18, 20);
      muzzleupper.addBox(-1.5F, -1F, -5F, 3, 2, 2);
      muzzleupper.setRotationPoint(0F, 0F, 0F);
      muzzleupper.setTextureSize(64, 32);
      muzzleupper.mirror = true;
      setRotation(muzzleupper, 0.0872665F, 0F, 0F);
      HeadBase.addChild(muzzleupper);
      ModelRenderer head = new ModelRenderer(this, 18, 12);
      head = new ModelRenderer(this, 18, 12);
      head.addBox(-2F, -3F, -3F, 4, 4, 4);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0.0872665F, 0F, 0F);
      HeadBase.addChild(head);
    mouthBase = new ModelRenderer(this, "mouthBase");
    mouthBase.setRotationPoint(0F, 0F, 0F);
    setRotation(mouthBase, 0F, 0F, 0F);
    mouthBase.mirror = true;
    ModelRenderer muzzlelower = new ModelRenderer(this, 18, 24);
      muzzlelower = new ModelRenderer(this, 18, 24);
      muzzlelower.addBox(-1F, 1F, -2F, 2, 1, 4);
      muzzlelower.setRotationPoint(0F, 0F, 0F);
      muzzlelower.setTextureSize(64, 32);
      muzzlelower.mirror = true;
      setRotation(muzzlelower, 0F, 0F, 0F);
      mouthBase.addChild(muzzlelower);
      HeadBase.addChild(mouthBase);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    body.render(f5);
    frontleftleg.render(f5);
    backleftleg.render(f5);
    backrightleg.render(f5);
    frontrightleg.render(f5);
    tail.render(f5);
    HeadBase.render(f5);
  }
   
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
	  	HeadBase.rotateAngleX = f4 / 57.29578F;
	  	HeadBase.rotateAngleY = f3 / 57.29578F;
	  	backrightleg.rotateAngleX = MathHelper.cos(f * 1.7F) * 1F * f1;
	  	backleftleg.rotateAngleX = MathHelper.cos(f * 1.7F + 3.141593F) * 1F * f1;
	  	frontrightleg.rotateAngleX = MathHelper.cos(f * 1.7F + 3.141593F) * 1F * f1;
	  	frontleftleg.rotateAngleX = MathHelper.cos(f * 1.7F) * 1F * f1;
  }

}